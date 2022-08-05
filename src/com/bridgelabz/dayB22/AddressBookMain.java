package com.bridgelabz.dayB22;

import java.util.Scanner;

public class AddressBookMain {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int ch;
		int ans;
		String state, city;
		AddressBook c = new  AddressBook();
		do {
			System.out.println("Enter the choice : ");
			System.out.println("1.Add ");
			System.out.println("2.Display");
			System.out.println("3.Edit");
			System.out.println("4.Delete");
			System.out.println("5.Search By State name");
			System.out.println("6.Search By City name");
			System.out.println("7.view By State name");
			System.out.println("8.View By City name");
			ch= s.nextInt();
			switch(ch) {
			case 1: 
				c.readData();
				break;
			case 2:
				c.DisplayContacts();
				break;
			case 3:
				System.out.println("\nEnter first name to edit :- ");
				String name = s.next();
				c.editData(name);
				break;
			case 4:
				c.deleteData();
				break;
			case 5:
				System.out.println("\nEnter the state name to display details :- ");
				state = s.next();
				c.searchPersonByState(state);
				break;
			case 6:
				System.out.println("\nEnter the city name to display details :- ");
				city = s.next();
				c.searchPersonByCity(city);
				break;
			case 7:
				System.out.println("\nEnter the state name :- ");
				state = s.next();
				c.viewPersonByState(state);;
				break;
			case 8:
				System.out.println("\nEnter the city name :- ");
				city = s.next();
				c.viewPersonByCity(city);;
				break;

			}System.out.println("Do you want to continue? if yes press '1' ");
			ans = s.nextInt();
		}while(ans == 1);

	}

}
