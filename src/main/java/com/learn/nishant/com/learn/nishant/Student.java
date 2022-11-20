package com.learn.nishant.com.learn.nishant;

public class Student {

	private int stId;
	private String stName;
	private String stAddress;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int stId, String stName, String stAddress) {
		super();
		this.stId = stId;
		this.stName = stName;
		this.stAddress = stAddress;
	}

	public int getStId() {
		return stId;
	}

	public void setStId(int stId) {
		this.stId = stId;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getStAddress() {
		return stAddress;
	}

	public void setStAddress(String stAddress) {
		this.stAddress = stAddress;
	}
	//To string method
	@Override
	public String toString() {
		return "Student [stId=" + stId + ", stName=" + stName + ", stAddress=" + stAddress + "]";
	}


	
}
