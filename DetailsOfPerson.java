package com.bl.AddressBook;

public class DetailsOfPerson {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zip;
	private String phoneNumber;
	private String email;
	
	//setter
	public void SetFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	//getter
	public String getFirstName() {
		return this.firstName;
	}
	
	public void LastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void Address(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void City(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void State(String state) {
		this.state = state;
	}
	
	public String getState() {
		return this.state;
	}
	
	public void Zip(int i) {
		this.zip = i;
	}
	
	public int getZip() {
		return this.zip;
	}
	
	public void PhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void Email(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	
	public String toString() {
		return "DetailaOfPerson [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", state=" + state + ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", email=" + email
			    + "]";
	}

}
