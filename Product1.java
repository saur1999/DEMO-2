package org.cdacnoida.course.Marks;

import java.util.Scanner;

public class Product1 {
	static String pname ;
	static float price;
	static int quantity ;
	
	 static void accptRecord() {
		Scanner f = new Scanner(System.in);
		
		System.out.println("Enter the name ");
		pname = f.next();
		
		System.out.println("Enter the price");
		price = f.nextFloat();
		
		 System.out.println("Enter the quantity");
		quantity = f.nextInt(); 
		
		f.close();
		
		
	}
	
	 static void printRecord() {
		if(price>2000)
		{
			System.out.println("Discount is 10% off");
			
			System.out.println("Name =  "+pname);
			System.out.println("Price =  "+price);
			System.out.println("Quantity = " +quantity);
			
		}
		else {
			System.out.println("Discount is 7% off");
		}
	
	}
	public static void main(String[] args) {
		System.out.println("WELCOME TO STORE");
		accptRecord();
		printRecord();
		
		

	}

}
