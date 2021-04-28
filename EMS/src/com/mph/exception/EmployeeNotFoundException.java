package com.mph.exception;

public class EmployeeNotFoundException extends Exception {
	public EmployeeNotFoundException(){
		System.out.println("From User not found exception");
	}
	public String toString(){

		return "UserNotFound. Plz check credential";
	}
}
