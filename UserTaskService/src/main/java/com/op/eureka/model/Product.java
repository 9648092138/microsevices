package com.op.eureka.model;

public class Product {
private int id;
private String pName;
private String pPrices;
private String pExpiredate;
private int userId;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public String getpPrices() {
	return pPrices;
}
public void setpPrices(String pPrices) {
	this.pPrices = pPrices;
}
public String getpExpiredate() {
	return pExpiredate;
}
public void setpExpiredate(String pExpiredate) {
	this.pExpiredate = pExpiredate;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
}
