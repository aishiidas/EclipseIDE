package org.anudip.bean;

public class Address {
	private String street;
	private String city;
	private int pin;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String city, int pin) {
		super();
		this.street = street;
		this.city = city;
		this.pin = pin;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		String output=String.format("%-15s %-15s %-10s",street,city,pin);
		return  output;
	}
	

}
