package com.bl.AddressBook;

public final class Console extends DetailsOfPerson {
	public static void main(String[] args) {
		
		java.io.Console c=System.console();
		System.out.println("Enter your firstName:");
		String n=c.readLine();
		
		java.io.Console c1=System.console();
		System.out.println("Enter your lastName:");
		String n1=c1.readLine();
		
		java.io.Console c2=System.console();
		System.out.println("Enter your Address:");
		String n2=c2.readLine();
		
		java.io.Console c3=System.console();
		System.out.println("Enter your City:");
		String n3=c3.readLine();
		
		java.io.Console c4=System.console();
		System.out.println("Enter your State:");
		String n4=c4.readLine();
		
		java.io.Console c5=System.console();
		System.out.println("Enter your Zip:");
		String n5=c5.readLine();
		
		java.io.Console c6=System.console();
		System.out.println("Enter your PhoneNumber:");
		String n6=c6.readLine();
		
		java.io.Console c7=System.console();
		System.out.println("Enter your Email:");
		String n7=c7.readLine();
	}
	
}

