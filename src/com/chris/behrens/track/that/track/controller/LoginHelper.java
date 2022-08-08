package com.chris.behrens.track.that.track.controller;


//this class is used to attach to the model to hold the user name and password that a user submits when using the login form
public class LoginHelper {
	private String userName;
	private String password;
	
	public LoginHelper() {
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
