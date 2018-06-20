/*
Name: Harlan Chang
Class: 20B
Assignment: Project 5
*/

import java.util.*;
import java.io.*;

public class Test
{
	public static void main(String[] args)
	{
		FurnitureBusiness myBusiness = new FurnitureBusiness();

		//Create the addresses for the customers
		Address add1 = new Address("123 Sesame St", "1", "Los Angeles", 91001, "CA");
		Address add2 = new Address("124 Sesame St", "5", "Los Angeles", 91001, "CA");
		Address add3 = new Address("125 Sesame St", "9", "Los Angeles", 91001, "CA");

		//Creates the Customers
		Customer myDude = new Customer(123, "Dude", new Date(), add1);
		Customer myMan = new Customer(124, "Man", new Date(), add2);
		Customer myBoi = new Customer(125, "Boi", new Date(), add3);

		//Creates the Furniture
		Furniture mySofa = new Sofa("Sofa", 5044, 1000);
		Furniture myRecliner = new Recliner("Recliner", 1231312, 2000);
		Furniture myTable = new Table("Table", 74813, 3000);
		Furniture myChair = new Chair("Chair", 44112, 4000);
		Furniture mySofa2 = new Sofa("Sofa2", 5045, 5000);

		//Stores the Furniture in a list
		List<Furniture> myList = new ArrayList();
		myList.add(mySofa);
		myList.add(myRecliner);
		myList.add(myTable);
		myList.add(myChair);
		myList.add(mySofa2);

		//Stores the Customers in a list
		List<Customer> myCust = new ArrayList();
		myCust.add(myDude);
		myCust.add(myMan);
		myCust.add(myBoi);
		
		//purchases the items 
		myBusiness.purchase(myDude, mySofa, myRecliner, myTable);
		myBusiness.purchase(myMan, myChair);
		myBusiness.purchase(myBoi, mySofa2);


		System.out.println("----------Check if bought------------");
		for(int i = 0; i < 3; i++)
		{
			System.out.println(myCust.get(i).getName());

			for(int h = 0; h < 5; h++)
			{
				System.out.print(myList.get(h).getName() + ": ");
				System.out.println(myBusiness.hasBought(myCust.get(i), myList.get(h)));
			}
			System.out.println();
		}

		System.out.println("---------Purchases-------------");
		for(int i = 0; i < 3; i++)
		{
			System.out.println(myCust.get(i).getName() + ": ");

			for(int h = 0; h < myBusiness.getPurchases(myCust.get(i)).size(); h++)
			{
				System.out.println(myBusiness.getPurchases(myCust.get(i)).get(h).getName());
			}
			System.out.println();
		}

		System.out.println("------------Money Spent------------");
		for(int i = 0; i < 3; i++)
		{
			System.out.print(myCust.get(i).getName() + " : $");
			System.out.println(myBusiness.moneySpent(myCust.get(i)));
		}

	}	
}