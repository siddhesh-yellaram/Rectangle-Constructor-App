package com.techlab.model;

public class Rectangle {
	private final int MAX_VAL = 100,MIN_VAL = 1;
	private int width, height;
	private Thickness thickness;
	
	public Rectangle(int width,int height) {
		this(width,height,Thickness.LOW);
	}
	
	public Rectangle(int width, int height, Thickness thickness){
		this.width = validateValue(width);
		this.height = validateValue(height);
		this.thickness = thickness;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public Thickness getThickness() {
		return thickness;
	}
	
	public int calculateArea() {
		return width * height;
	}
	
	private int validateValue(int obj) {
		if(obj > 100) {
			obj = MAX_VAL;
		}else if(obj < 0) {
			obj = MIN_VAL;
		}
		return obj;
	}

}
