package com.mph.view;

import java.util.Scanner;

public class Demo {
	
	private int id;
	
	public Demo(int id){
		this.id=id;
	}
	
	public String toString() {
		return "id"+id;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number:");
		//int n= sc.nextInt();
		int n=5;
		
		for(int j=0;j<n;j++) {
			for(int k=2*(n-j);k>=0;k--) {
			System.out.print(" ");
			}
			for(int i=0;i<=j;i++) {
			System.out.print("*");
			}
			System.out.println();
		}

	}

}
