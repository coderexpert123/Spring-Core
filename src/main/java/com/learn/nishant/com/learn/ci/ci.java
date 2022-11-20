package com.learn.nishant.com.learn.ci;

public class ci {

	private int pid;
	private String pname;

	public ci(String pname, int pid) {
		this.pname = pname;
		this.pid = pid;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.pname + "" + this.pid;

	}

}
