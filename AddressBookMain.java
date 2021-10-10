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
	
		
		DetailsOfPerson person1 = new DetailsOfPerson();
		person1.FirstName("Sakshi");
		person1.LastName("Ghogare");
		person1.Address("ITI");
		person1.City("Nanded");
		person1.State("Maharashtra");
		person1.Zip(431605);
		person1.PhoneNumber("9327659470");
		person1.Email("sakshi@gmail.com");
		System.out.println(person1.toString());
		
	   
		DetailsOfPerson person2 = new DetailsOfPerson();
		person2.FirstName("Namrata");
		person2.LastName("Bajaj");
		person2.Address("Navi Street");
		person2.City("Pune");
		person2.State("Maharashtra");
		person2.Zip(400011);
		person2.PhoneNumber("8907623425");
		person2.Email("namrata@gmail.com");
		System.out.println(person2.toString());		


		
		
		
		
		
	}

	
	


}
