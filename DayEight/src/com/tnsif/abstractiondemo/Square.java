package com.tnsif.abstractiondemo;

public class Square extends Shape {
	float side;

	// default Constructor

	public Square() {
		side = 2.0f;
	}

	// Parameterized constructor
	public Square(float side) {
		this.side = side;
	}

	@Override
	void calArea() {
		this.area=this.side*this.side;

	}

}
