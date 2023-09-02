package com.nissan.model;

public class Square extends Shape{


	
	public double area;

	public double len;
	
	
	
	
	public Square(double len) {
		super();
		
		this.len = len;
	}




	public double area() {
		
		this.area = len * len;
		return area;
		
	}
	
	

}
