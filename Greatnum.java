package org.cdacnoida.course.Marks;

import java.util.Scanner;

public class Greatnum {

	static int num1;
	static int num2;
	
	static void accpetRecord() {
		Scanner l = new Scanner(System.in);
		
		System.out.println("Enter num1");
		num1 = l.nextInt();
		
		System.out.println("Enter num2");
		num2 = l.nextInt();
		l.close();
	}
	
	static void printRecord() {
		
		if(num1 > num2) {
			System.out.println("Num1 is grater ");
		}
		else if(num2 >num1){
			System.out.println("Num2 is greater");
		}
		else {
			System.out.println("Ok");
		}
	}
	public static void main(String[] args) {
		accpetRecord();
		printRecord();

	}

}
