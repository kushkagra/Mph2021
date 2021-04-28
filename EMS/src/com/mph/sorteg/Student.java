package com.mph.sorteg;

import java.io.Serializable;
import java.util.Comparator;

public class Student implements Comparable<Student> , Serializable{
	private int sid;
	private String sname;
	private transient int age; //transient field will not get serialized
	private int marks;
	
	
	public Student() {
		super();
	}
	public Student(int sid, String sname, int age, int marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.marks = marks;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", age=" + age + ", marks=" + marks + "]";
	}
	
	public int compareTo(Student s1) {
		
		return this.age - s1.age;
	}
	
	//Anonymous class
	public static Comparator<Student> nameComparator= new Comparator<Student>() {

		@Override
		public int compare(Student s1, Student s2) {

			return (s1.getSname().compareTo(s2.getSname()));
		}
		
	};
		
	public static Comparator<Student> ageComparator= new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {

				return (s1.getAge() - s2.getAge());
			}
	
		
		
		
	};
}
