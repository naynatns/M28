package com.tnsif.abstractiondemo;

public class Rectangle extends Shape {
	float width, height;

	// Deafult
	public Rectangle() {
		this.width = 2.0f;
		this.height = 1.0f;
	}

	// Parameterized
	public Rectangle(float width, float height) {
		
		this.width = width;
		this.height = height;
	}

	@Override
	void calArea() {
		area = width * height;

	}

}
