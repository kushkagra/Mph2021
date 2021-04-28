package com.mph.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.mph.dao.EmployeeDao;
import com.mph.model.Employee;
import com.mph.model.Manager;
import com.mph.model.Salary;
import com.mph.sorteg.Student;

public class EmployeeController implements EmployeeInterface {
	Employee emp;
	Salary sal;
	Manager pro;
	List<Employee> emplist  = new ArrayList<Employee>();
	EmployeeDao empdao = new EmployeeDao();
	public List addEmployee() {
		
		emp = new Employee(); 
		
		Scanner sc= new Scanner(System.in);
		//System.out.println("Enter the number of emp");
		
		
		System.out.println("Enter Eid:");
		int eno =sc.nextInt();
		emp.setEid(eno);
		System.out.println("Enter Ename:");
		String enam= sc.next();
		//int num = sc.nextInt();
		//System.out.println("Enter the Ename");
		emp.setEname(enam);
		
		sal =new Salary();
		System.out.println("Enter basic salary");
		int basic = sc.nextInt();
		sal.setBasic(basic);
		//System.out.println("Enter DA");
		//int da = sc.nextInt();
		//sal.setDa(da);
		//System.out.println("Enter HRA");
		//int hra = sc.nextInt();
		//sal.setHra(hra);
		//System.out.println("Enter PF");
		//int pf = sc.nextInt();
		//sal.setPf(pf);
		
		sal.setGross(basic);
		sal.setDa(basic);
		sal.setHra(basic);
		sal.setNet(sal.getGross());
		
		
		emp.setSalary(sal);
		
		//emplist.add(emp);
		empdao.insertEmp(emp,sal);
		
		
		//System.out.println(emp.getEid()+"  "+emp.getEname());
		//System.out.println(emp);
		System.out.println("Employee "+ eno +" successfully added");
		return emplist;
	}
	
	public void viewEmployee(List elist) {
		
		/*Iterator i = elist.iterator();
		
		/*while(i.hasNext()) {
			System.out.println(i.next());
		}*/
		//elist.forEach(lis -> System.out.println(lis));
		empdao.viewEmp();
	}
	
	public void insertUsingproc() {
		Employee e = new Employee();
		Salary s = new Salary();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Eid:");
		int eno =sc.nextInt();
		e.setEid(eno);
		System.out.println("Enter Ename:");
		String en= sc.next();
		e.setEname(en);
		System.out.println("Enter basic salary");
		int basic = sc.nextInt();
		s.setBasic(basic);
		empdao.insertUsingProcedure(e, s);
	}
	
	public void addProject() {
		pro =new Manager();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the project");
		String project = sc.next();
		pro.setProject(project);
		System.out.println("Project "+ pro +"successfully added");
		
	}
	
	public void viewProject() {
		
		System.out.println(pro);
	}
	
	public void compare() {
		
		Collections.sort(emplist,Employee.nameComparator);
		/*emp = new Employee(); 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of Emp.");
		int num = sc.nextInt();
		
		Employee[] emArray =new Employee[num];
		
		for(int i=0;i<num;i++) {
			System.out.println("Enter Eid:");
			int eid=sc.nextInt();
			System.out.println("Enter Ename:");
			String ename= sc.next();
			
			emArray[i]= new Employee(eid,ename); 
		}
		

		Arrays.sort(emArray,Employee.nameComparator);
		System.out.println("Sorted Employee Array w.r.t Name: "+Arrays.toString(emArray)); */
		
		
		
	}
	
	public void search() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Letter to search:");
		String ss = sc.next();
		if(ss.length()==1) {
			char c=ss.charAt(0);
			
			boolean check = Character.isUpperCase(c);
			//System.out.println(checkBool);
			//if(check){
			//	c=c.toLowerCase()
			//}
				
				List<Employee> grp=emplist.stream().filter(s -> s.getEname().startsWith(ss)).collect(Collectors.toList());
				//System.out.println(grp);
				grp.forEach(System.out::println);
			
		}
		else {
			System.out.println("Please enter only one letter");
		}
	}
	public void serial() {
		emp.getEid();
		emp.getEname();
		emp.getSalary();
		
		FileOutputStream fos =null;
		ObjectOutputStream oos =null;
		
		try {
			fos = new FileOutputStream("myfile.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
				oos.close();
				
			}
			catch(IOException o){
				o.printStackTrace();
			}
			
		}
		System.out.println("Serialization completed...");
	}
	
	public void deSerial() {
		Employee em =null;
		try {
			FileInputStream fis = new FileInputStream("myfile.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			em=(Employee)ois.readObject();
			fis.close();
			ois.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			//System.out.println("From finally...");
			System.out.println("Employee Id: "+em.getEid());
			System.out.println("Employee Name: "+em.getEname());
			System.out.println(em.getSalary());
		}
	}
	
	public void rsmd() {
		empdao.rsmd();
	}
	
	public void type_forward_only_rs(){
		empdao.type_forward_only_rs();
	}
	
	public void type_scroll_insensitive_rs() {
		empdao.type_scroll_insensitive_rs();
	}
	
	public void type_scroll_sensitive_rs_insert() {
		empdao.type_scroll_sensitive_rs_insert();
	}

	@Override
	public void type_scroll_sensitive_rs_update() {
		empdao.type_scroll_sensitive_rs_update(emp,sal);
		
	}

	@Override
	public void batchUpdate() {
		empdao.batchUpdate();
		
	}
	
	
	
}
