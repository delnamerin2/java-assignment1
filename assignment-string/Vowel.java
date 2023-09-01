package com.assignment.app;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the character: ");
		char ch = sc.next().charAt(0);
		
		ch = Character.toLowerCase(ch);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.println("Character is vowel");
		else
			System.out.println("Character is consonant");
		
		sc.close();

	}

}
