package com.nissan.model;



public class RectangleFigure extends Figure{

	public RectangleFigure(double dim1, double dim2) {
		super(dim1, dim2);
		// TODO Auto-generated constructor stub
	}
	
	public double area() {
		return dim1*dim2;
	}
	

}
