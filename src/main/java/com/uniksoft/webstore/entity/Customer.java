package com.uniksoft.webstore.entity;

public class Customer {

	private long customerId;
	private String name;
	private String address;
	private int noOfOrdersMade;
	
	public Customer() {}
	
	public Customer(long customerId, String name, String address, int noOfOrdersMade) {
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.noOfOrdersMade = noOfOrdersMade;
	}
	
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNoOfOrdersMade() {
		return noOfOrdersMade;
	}
	public void setNoOfOrdersMade(int noOfOrdersMade) {
		this.noOfOrdersMade = noOfOrdersMade;
	}
	
}
