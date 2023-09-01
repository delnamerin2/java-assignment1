package com.assignment.app;

class Box1{
	double height,width,depth;
	Box1(double height,double width,double depth){
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	void calculateVolume() {
		double volume = height*width*depth;
		System.out.println("Volume is "+volume);
	}
}

public class C8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box1 obj1 = new Box1(1,2,3);
		Box1 obj2 = new Box1(2,3,4);
		
		obj1.calculateVolume();
		obj2.calculateVolume();

	}

}
