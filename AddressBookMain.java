package com.bl.AddressBook;

public class AddressBookMain {
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Address Book System");
		
		DetailsOfPerson person = new DetailsOfPerson();
		person.FirstName("Rutuja");
		person.LastName("Jakwad");
		person.Address("B and c colony");
		person.City("Nanded");
		person.State("Maharashtra");
		person.Zip(431605);
		person.PhoneNumber("9423064636");
		person.Email("rutuja@gmail.com");
		System.out.println(person.toString());
		
		
	}

}
