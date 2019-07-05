package com.example.cloud.greet.domain;

public class Details {

	GreetObject greetObject;
	String serverPort;
	
	public Details() {
	}

	public Details(GreetObject greetObject, String serverPort) {
		super();
		this.greetObject = greetObject;
		this.serverPort = serverPort;
	}

	public GreetObject getGreetObject() {
		return greetObject;
	}

	public void setGreetObject(GreetObject greetObject) {
		this.greetObject = greetObject;
	}

	public String getServerPort() {
		return serverPort;
	}

	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}
	
}
