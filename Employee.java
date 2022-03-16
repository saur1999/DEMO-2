package org.cdacnoida.course.Marks;

import java.util.Scanner;

public class Employee { 
	
	static String name ;
	static int age ;
	static float salary ;
	
	static void accpetRecord() {
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("Enter Name");
		name = k.next();
		System.out.println("Enter age");
		age = k.nextInt();
		System.out.println("Enter salaray");
		salary = k.nextFloat();
		
		k.close();
		
	}
	
	static void printRecord() {
		System.out.println("Name =  "+name);
		System.out.println("Age  = "+age);
		System.out.println("Salary = "+salary);
	}

	public static void main(String[] args) {
		
		accpetRecord();
		printRecord();
		

	}

}
