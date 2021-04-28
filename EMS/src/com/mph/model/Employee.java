package com.mph.model;

import java.io.Serializable;
import java.util.Comparator;


//pojo - Plain Old Java Object -- must have only private instance variable and public get() set()
public class Employee implements Comparable<Employee>, Serializable {
	private transient int eid;
	private String ename;
	private Salary salary;
	
	public Employee(){
		//System.out.println("From Emp constructor");
	}
	
	public Employee(int eid,String ename){
		this.eid=eid;
		this.ename=ename;
	}

	public void setEid(int eid) {
		this.eid=eid;
	}
	
	public int getEid(){
		return this.eid;
	}
	
	public void setEname(String ename) {
		this.ename=ename;
	}
	
	public String getEname(){
		return ename;
	}
	
	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	public static Comparator<Employee> nameComparator= new Comparator<Employee>() {


		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return (o1.getEname().compareTo(o2.getEname()));
		}
		
	};
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	};


	

	
}
