package com.bl.AddressBook;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numberOfPerson = 0;
		
//	    AddressBookMain newPerson = new AddressBookMain();
		
		System.out.println("How many person do you want to enter: ");
	    numberOfPerson = scan.nextInt();
	    
	    DetailsOfPerson []detailsOfPersons; 
	    detailsOfPersons= new DetailsOfPerson[numberOfPerson];
	    
	    
	    
	    for(int i = 0; i < numberOfPerson; i++) {
	    	detailsOfPersons[i] = new DetailsOfPerson();
	    	
	    	System.out.println("Enter your firstName: ");
	    	detailsOfPersons[i].SetFirstName(scan.next());
			
			System.out.println("Enter your lastName: ");
			detailsOfPersons[i].LastName(scan.next());
			
			System.out.println("Enter your address: ");
			detailsOfPersons[i].Address(scan.next());
			
			System.out.println("Enter your city: ");
			detailsOfPersons[i].City(scan.next());
			
			System.out.println("Enter your state: ");
			detailsOfPersons[i].State(scan.next());
			
			System.out.println("Enter your pincode: ");
			detailsOfPersons[i].Zip(scan.nextInt());
			
			System.out.println("Enter your email: ");
			detailsOfPersons[i].Email(scan.next());
	    }
	    
	    for(DetailsOfPerson details : detailsOfPersons) {
	    	System.out.print(details.getFirstName());
	    }
	    
	    for(DetailsOfPerson details : detailsOfPersons) {
	    	System.out.print(details.getLastName());
	    }
	    
	    for(DetailsOfPerson details : detailsOfPersons) {
	    	System.out.print(details.getAddress());
	    }
	    
	    for(DetailsOfPerson details : detailsOfPersons) {
	    	System.out.print(details.getCity());
	    }
	    
	    for(DetailsOfPerson details : detailsOfPersons) {
	    	System.out.print(details.getState());
	    }
	    
	    for(DetailsOfPerson details : detailsOfPersons) {
	    	System.out.print(details.getZip());
	    }
	    
	    for(DetailsOfPerson details : detailsOfPersons) {
	    	System.out.print(details.getPhoneNumber());
	    }
	    
	    for(DetailsOfPerson details : detailsOfPersons) {
	    	System.out.print(details.getEmail());
	    }
	}

}
