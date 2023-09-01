package demojava;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0;
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		for(i=0;i<a.length();i++)
		{
			char c=a.charAt(i);
			if(Character.isDigit(c)) {
				sum+=Character.getNumericValue(c);
			}
		}
     System.out.println(sum);
	}

}
