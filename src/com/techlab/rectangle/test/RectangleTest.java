package com.techlab.rectangle.test;

import com.techlab.model.Rectangle;
import com.techlab.model.Thickness;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle bigRect = new Rectangle(50,40,Thickness.LOW);
		Rectangle smallRect = new Rectangle(20,90,Thickness.HIGH);
//		Rectangle newRect = new Rectangle(20,90);
		Rectangle[] bigRect1 = new Rectangle[3];
		bigRect1[0] = bigRect;
		bigRect1[1] = smallRect;
		bigRect1[2] = new Rectangle(50, 40);
		printArray(bigRect1);
		
//		System.out.println("Big Rectangle: ");
//		createRectangle(bigRect);
//		System.out.println("Small Rectangle: ");
//		createRectangle(smallRect);
//		System.out.println("New Rectangle: ");
//		createRectangle(newRect);
	}
	public static void createRectangle(Rectangle obj) {
		System.out.println("Width: "+obj.getWidth());
		System.out.println("Height: "+obj.getHeight());
		System.out.println("Thickness: "+obj.getThickness());
		System.out.println("Total Area: "+obj.calculateArea());
	}
	
	public static void printArray(Rectangle obj[]) {
		for(int i = 0; i < 3; i++) {
			System.out.println("\nWidth: "+obj[i].getWidth());
			System.out.println("Height: "+obj[i].getHeight());
			System.out.println("Thickness: "+obj[i].getThickness());
			System.out.println("Total Area: "+obj[i].calculateArea());
		}
	}
}
