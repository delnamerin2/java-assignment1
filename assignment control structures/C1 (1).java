package com.assignment.app;

import java.util.Scanner;

public class C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amt;
		Scanner sc = new Scanner(System.in);
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Enter type of customer \nDomestic(d) or Industry(i): ");
		char c = sca.next().charAt(0);
		
		System.out.println("Enter units: ");
		
		double units = sc.nextDouble();
		
		if(c == 'i') 
			amt = units*10;
		
		else {
			
			if (units>0 && units<=100)
				amt = units *1 ;
			else if (units>100 && units<=200)
				amt = units *1.5 ;
			else if (units>200 && units<=500)
				amt = units *2 ;
			else
				amt = units *5 ;
		}
		System.out.println("Amount is "+amt);
		sc.close();
		sca.close();
	}

}
