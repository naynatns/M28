package com.tnsif.daytwelve.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {
	 static String acceptText() throws IOException
	 {
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the String...");
		 String str=br.readLine();
		return str;
	 }
	
	

	public static void main(String[] args) {
		
		try {
			String str1=acceptText();
			System.out.println("Your String is "+str1);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
