package com.assignment.app;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		
		int index = str.indexOf("#");
		str = str.substring(0, index-1) + "" + str.substring(index + 2);
		
		System.out.println("String after replacement: "+str);

		
		sc.close();
	}

}
