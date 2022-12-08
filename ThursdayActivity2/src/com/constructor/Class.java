package com.constructor;
import java.util.Arrays;
class Circle {
	private float centre;
	private float radius;
	private static int count=0;
	Circle()
	{
		System.out.println("constructor with no parameters:");
	}
	Circle(float centre,float radius){
		this.centre=centre;
		this.radius=radius;
		count++;
	}
	public static void main(String[] args) {
    Circle c1 =new Circle(14.1f,26.4f);
    Circle c2 =new Circle(16.4f,24.6f);
	System.out.println("Circle 1- centre :"+c1.centre + "Radius :"+c1.radius);
		
		System.out.println("Circle 2- centre :"+c2.centre+ "Radius :"+c2.radius);
		System.out.println("No. of instances of class Circle: "+Circle.count);
	}
}

		
	
			
	


