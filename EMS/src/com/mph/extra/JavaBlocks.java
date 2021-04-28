package com.mph.extra;

public class JavaBlocks {
	
	static int num1;
	int num2;
	
	public JavaBlocks() {
		System.out.println("From Java block constructor");
	}
	//static block
	static {
		System.out.println("Static Block");
		num1=400;
		System.out.println(num1 +" from static block");
	}
	
	//static block -2
		static {
			System.out.println("Static Block 2");
			num1=400;
			System.out.println(num1 +" from static block 2");
		}
	
	//Non static block
	{
		System.out.println("Non-Static block");
		num2=500;
		System.out.println(num2 +" from static block");
	}
	
	public static void staticdisplay() {
		
		System.out.println("From static display");
	}

	public void display() {
		
		System.out.println("From display");
	}
	
	public static void main(String[] args) {
		
		JavaBlocks jb = new JavaBlocks();
		JavaBlocks jb1 = new JavaBlocks();
		//jb.display();
		jb.staticdisplay();
		jb.display();
	}

}
