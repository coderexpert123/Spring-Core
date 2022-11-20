package com.learn.nishant.com.learn.anot;

public class Address {
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String city, String strret) {
		super();
		this.city = city;
		this.strret = strret;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStrret() {
		return strret;
	}
	public void setStrret(String strret) {
		this.strret = strret;
	}
	private String city;
	private String strret;
	

}
