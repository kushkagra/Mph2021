package com.mph.sorteg;

public class Varargs {
	
	public static void sum(int... x) {
		for(int s:x) {
		System.out.println(s);
		}
	}

	public static void main(String[] args) {
		sum(1,2,3,4);
		sum(5,6,7,8);

	}

}
