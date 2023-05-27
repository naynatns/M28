package com.tnsif.userdefinedannotations;



@SmartTV(height = 30, os = "Android", width = 40)
@SmartPhone
public class AndroidSeries {
	
	String model;
	int screenSize;
	
	
	public AndroidSeries(String model, int screenSize) {
		
		this.model = model;
		this.screenSize = screenSize;
	}
	
	
	
	

}
