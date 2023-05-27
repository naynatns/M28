package com.tnsif.userdefinedannotations;

import java.lang.annotation.Annotation;

public class AnnotationsDemo {

	public static void main(String[] args) {
		
		AndroidSeries as=new AndroidSeries("A23", 14);
		
		System.out.println((as.model));
		System.out.println((as.screenSize));
		
		System.out.println("SmartPhone details are as follows: ");
		
		@SuppressWarnings("rawtypes")
		Class c=as.getClass();
		
		@SuppressWarnings("unchecked")
		Annotation an=c.getAnnotation(SmartPhone.class);
		
		SmartPhone s=(SmartPhone) an; //class casting
		
		System.out.println(s.os());
		System.out.println(s.version());
		
		System.out.println("-------------------------------");
		
		System.out.println("SmartTV details are as follows: ");
		@SuppressWarnings("unchecked")
		
		Annotation an1=c.getAnnotation(SmartTV.class);
		
		SmartTV s1=(SmartTV) an1; //class casting
		
		System.out.println(s1.os());
		System.out.println(s1.height());
		System.out.println(s1.width());


	

	}

}