package com.op.eureka.model;

public class Users {
private int id;
private String userName;
private String userEmail;

public Users() {
	super();
}

public int getId() {
	return id;
}

public String getUserName() {
	return userName;
}

public String getUserEmail() {
	return userEmail;
}

public Users(int id, String userName, String userEmail) {
	super();
	this.id = id;
	this.userName = userName;
	this.userEmail = userEmail;
}

public void setId(int id) {
	this.id = id;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}
}