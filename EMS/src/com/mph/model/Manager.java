package com.mph.model;

import java.util.Scanner;

public class Manager extends Employee {
	
	private String project;

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Manager [project=" + project + "]";
	}
	
	
	
	
	

}
