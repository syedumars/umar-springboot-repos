package com.umar;

import org.springframework.stereotype.Component;

@Component("modem1")
public class InternetConnection {

	
	private int ip;
	private String modem;
	
	public int getIp() {
		return ip;
	}

	public void setIp(int ip) {
		this.ip = ip;
	}

	public String getModem() {
		return modem;
	}

	public void setModem(String modem) {
		this.modem = modem;
	}

	public void switchOn() {
		System.out.println("modem switching on...");
	}
}
