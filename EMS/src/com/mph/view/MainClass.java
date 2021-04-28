package com.mph.view;

import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;

import com.mph.controller.EmployeeController;
import com.mph.controller.EmployeeInterface;
import com.mph.exception.EmployeeNotFoundException;
import com.mph.model.Employee;
import com.mph.model.Manager;

public class MainClass implements Runnable {
	
	private static String user="kush";
	private static String pass="1234";

	
	public static void main(String[] args) {
		MainClass t = new MainClass();
		t.run();
		EmployeeInterface ec= new EmployeeController();
		List<Employee> elist=null;
		Scanner sc= new Scanner(System.in);
		
		String input= null;
		try {
		System.out.println("Enter Username:");
		String us=sc.next();
		System.out.println("Enter your Password");
		String pw=sc.next();
		//if(us.equals(user)&& pw.equals(pass))
		BiPredicate<String, String> pred  = (user,pass)->us.equals(user)&& pw.equals(pass);
		if(pred.test(user,pass))
		{
			try {
				System.out.println("Loading..., Please Wait.");
				Thread.sleep(3000);
				
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		do {
			System.out.println("Enter your choice");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee");
			System.out.println("3. Insert Procedure");
			System.out.println("4. Add project");
			System.out.println("5. View project");
			System.out.println("6. Compare");
			System.out.println("7. Search");
			System.out.println("8. Serialization");
			System.out.println("9. Deserialization");
			System.out.println("10. Get metadata of table");
			System.out.println("11. Type forward");
			System.out.println("12. Type forward without insert");
			System.out.println("13. Type forward with insert");
			System.out.println("14. Type forward with update");
			System.out.println("15. Batch Update");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:{
				elist= ec.addEmployee();
				break;
			}
			case 2:{
				ec.viewEmployee(elist);
				break;
			}
			case 3:{
				ec.insertUsingproc();
				break;
			}
			case 4:{
				ec.addProject();
				break;
			}
			case 5:{
				ec.viewProject();
				break;
			}
			case 6:{
				ec.compare();
				break;
			}
			case 7:{
				ec.search();
				break;
			}
			case 8:{
				ec.serial();
				break;
			}
			case 9:{
				ec.deSerial();
				break;
			}
			case 10:{
				ec.rsmd();
				break;
			}
			case 11:{
				ec.type_forward_only_rs();
				break;
			}
			case 12:{
				ec.type_scroll_insensitive_rs();
				break;
			}
			case 13:{
				ec.type_scroll_sensitive_rs_insert();
				break;
			}
			case 14:{
				ec.type_scroll_sensitive_rs_update();
				break;
			}
			case 15:{
				ec.batchUpdate();
				break;
			}
			
		
			default:{
			
			}
			}
		
			System.out.println("Do you want to continue? Y or y for yes");
			input= sc.next();
		}while(input.equals("Y")|| input.equals("y"));
		System.out.println("System Exited..");
		System.exit(0);
		}else {
			throw new EmployeeNotFoundException();
		}
		}
		catch (EmployeeNotFoundException e){
			
			System.out.println(e);
			//e.printStackTrace();
		}
		/*Employee emp = new Employee(); 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of emp");
		int eid=0;
		String ename="";
		emp.setEid(eid);
		int num = sc.nextInt();
		System.out.println("Enter the Ename");
		emp.setEname(ename);
		System.out.println(emp.getEid()+"  "+emp.getEname());
		System.out.println(emp);
		Employee[] emprr= new Employee[num];
		for(int i=0;i<num;i++) {
			System.out.println("Enter Eid:");
			eid=sc.nextInt();
			System.out.println("Enter Eid:");
			ename= sc.next();
			
			emprr[i]= new Employee(eid,ename); 
		}
		for(Employee j:emprr){
			System.out.println(j);
		}*/
		
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}	
	
}
