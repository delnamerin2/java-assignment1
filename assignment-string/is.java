package com.assignment.app;

import java.util.Scanner;

public class is {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		str = str.replace("is", "is not");
		
		System.out.println("String after replacement: "+str);
		
		sc.close();
	}

}
