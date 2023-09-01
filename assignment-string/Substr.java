package com.assignment.app;

import java.util.Scanner;

public class Substr {

	
	public static String SubString(String stng) 
	{
	  int len = stng.length();
	  String frStr = "";
	  String tmp = "";
	  for (int i = 0; i < len; i++) 
	  {
	    tmp += stng.charAt(i);
	    int tmpLen = tmp.length();
	    if (i < len / 2 && tmp.equals(stng.substring(len-tmpLen,len)))
	      frStr = tmp;
	  }
	  return frStr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		System.out.println("Longest Sub-String is: "+ SubString(str));
		
		sc.close();
	}

}
