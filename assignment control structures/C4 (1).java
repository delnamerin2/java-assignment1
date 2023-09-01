package com.assignment.app;

import java.util.Scanner;

public class C4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short month;
		System.out.println("Enter the month number: ");
		Scanner sc = new Scanner(System.in);
		month = sc.nextShort();
		
		switch(month) {
		case 1:
		case 2:
		case 12: System.out.println("Season is Winter");break;
		case 3:
		case 4:
		case 5:	System.out.println("Season is Spring");break;
		case 6:
		case 7:
		case 8:	System.out.println("Season is Summer");break;
		case 9:
		case 10:
		case 11: System.out.println("Season is Autumn");break;
		
		default: System.out.println("Invalid Entry");break;

		}
		
		sc.close();

	}

}
