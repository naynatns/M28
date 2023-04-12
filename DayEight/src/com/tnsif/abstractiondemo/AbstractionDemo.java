package com.tnsif.abstractiondemo;

public class AbstractionDemo {

	public static void main(String[] args) {
		Square s=new Square();
		s.calArea();
		s.show();
		
		Rectangle r=new Rectangle();
		
		r.show();
		r.calArea();

		r.show();
		
		//Dynamic Binding
		
		Shape sh;
		sh=new Square(4.7f);
		sh.calArea();
		sh.show();
		
		
		sh=new Rectangle(1.9f,2.0f);
		sh.calArea();
		sh.show();
		
		
		
	}

}
