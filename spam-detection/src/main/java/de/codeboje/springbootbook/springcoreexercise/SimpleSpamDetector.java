package de.codeboje.springbootbook.springcoreexercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SimpleSpamDetector implements SpamDetector {

	private List<String> spamWords = new ArrayList<String>();
	// classpath:data/resource-data.txt
	public SimpleSpamDetector() throws IOException {
		spamWords = Files.readAllLines(Paths.get("spamwords.txt"));
	}

	public boolean containsSpam(String value) {
		

		for (String spam : spamWords) {
			if (value.toLowerCase().contains(spam)) {
				return true;
			}
		}
		return false;
	}

}
