package com.mph.extra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

enum color{
	
	RED,BLUE,GREEN;
}


public class EnumEg {
	
	enum carcolor{
		
		HONDA(10),CHEV(12),MARUTI(14);
		
		private int val;
		
		carcolor(int value){
			this.val=value;
			
		}
	}

	public static final int RED=1;
	public static final int BLUE=2;
	public static final int GREEN=3;
	
	
	
	public static void main(String[] args) throws IOException {
	
		for (color c : color.values()) {
			
			System.out.println(c + " " + c.ordinal());
		}
		
		carcolor choice;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your choice");
		choice = carcolor.valueOf(br.readLine());
		
		switch(choice) {
		case HONDA:
		{
			System.out.println("Honda color ");
			break;
		}
		case CHEV:
		{
			System.out.println("Chev color");
			break;
		}
		case MARUTI:
		{
			System.out.println("Maruti color");
			break;
		}
		default:
		{
			System.out.println("No car ");
		}
		}

	}

}
