package com.objectpool;

public class Connection {
	private boolean inUse=false;
	
	public void connect() {
		System.out.println("connection in use.......");
	}
	public boolean isInUse() {
		return inUse;
	}
	public void setInUse(boolean inUse) {
		this.inUse = inUse;
	}
}
