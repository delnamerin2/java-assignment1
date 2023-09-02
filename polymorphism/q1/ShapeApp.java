package com.nissan.app;

import com.nissan.model.*;

public class ShapeApp {
	
	public static void calculateArea(Shape obj) {
		System.out.println(obj.area()); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape r = new Rectangle(20,10);
		
		calculateArea(r);
		
		Shape s = new Square(10);
		
		calculateArea(s);
		

	}

}
