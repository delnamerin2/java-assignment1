package com.assignment.app;

import java.util.Scanner;

public class C5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short opt;
		Scanner sc = new Scanner(System.in);

		do {
		System.out.println("Help on:\n" + 
				"1. if\n" + 
				"2. switch\n" + 
				"3. while\n" + 
				"4. do-while\n" + 
				"5. for");
		
		System.out.println("Choose one: ");
		opt = sc.nextShort();
		switch(opt) {
		case 1: System.out.println("if(condition){  \r\n" + 
				"//code to be executed  \r\n" + 
				"}  ");break;
		case 2: System.out.println("switch(expression) {\r\n" + 
				"  case x:\r\n" + 
				"    // code block\r\n" + 
				"    break;\r\n" + 
				"  case y:\r\n" + 
				"    // code block\r\n" + 
				"    break;\r\n" + 
				"  default:\r\n" + 
				"    // code block\r\n" + 
				"}");break;
		case 3: System.out.println("while (condition) {\r\n" + 
				"  // code block to be executed\r\n" + 
				"}");break;
		case 4: System.out.println("do{    \r\n" + 
				"//code to be executed / loop body  \r\n" + 
				"//update statement   \r\n" + 
				"}while (condition);");break;
		case 5: System.out.println("for (statement 1; statement 2; statement 3) {\r\n" + 
				"  // code block to be executed\r\n" + 
				"}");break;
		default: System.out.println("Invalid entry");break;
		
		}
		
		}while(opt<=5);
		sc.close();

	}

}
