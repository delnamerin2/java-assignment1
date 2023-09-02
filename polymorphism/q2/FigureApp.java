package com.nissan.app;

import com.nissan.model.*;

public class FigureApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Figure r = new RectangleFigure(20,10);
		
		System.out.println("Area: "+r.area());
		
		Figure t = new Triangle(20,10);
		
		System.out.println("Area: "+t.area());
		

	}

}
