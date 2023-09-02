package com.nissan.model;

public class Rectangle extends Shape{
	
	public double area;

	public double len,width;

	
	
	public Rectangle( double len, double width) {
		super();
		
		this.len = len;
		this.width = width;
	}



	public double area() {
		
		this.area = len * width;
		return area;
		
	}
	
}
