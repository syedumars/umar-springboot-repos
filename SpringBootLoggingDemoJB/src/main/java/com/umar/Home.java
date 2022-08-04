package com.umar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")  //This line changes the default "Singleton" Scope to "Prototype" Scope
public class Home {

	private String connectionName;
	private String modemModel;
	private int connStrength;
	
	@Autowired 				// search by Type "InternetConnection". if many interfaces on same name, it could be ambiguous
	@Qualifier("modem1")  	// searches by Name
	private InternetConnection myConnection;
	
	
	public Home() {
		System.out.println("Default Constructor is called");
	}
	public String getConnectionName() {
		return connectionName;
	}
	public void setConnectionName(String connectionName) {
		this.connectionName = connectionName;
	}
	public String getModemModel() {
		return modemModel;
	}
	public void setModemModel(String modemModel) {
		this.modemModel = modemModel;
	}
	public int getConnStrength() {
		return connStrength;
	}
	public void setConnStrength(int connStrength) {
		this.connStrength = connStrength;
	}
	
	public void connect() {
		myConnection.switchOn();
		System.out.println("Internet Connecting...");
	}
	
}
