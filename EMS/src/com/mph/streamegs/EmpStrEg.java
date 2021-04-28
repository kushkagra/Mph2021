package com.mph.streamegs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmpStrEg {
	
	public static void main(String args[]) {
		Employee[] empArr= {
			new Employee("Kush","Kagra","IT",90000),
			new Employee("Amir","Khan","HR",75000),
			new Employee("Amitabh","Bachchan","HR",75000),
			new Employee("Salman","Khan","Marketing",60000),
			new Employee("Shahrukh","Khan","Marketing",60000)
		};
		
		List<Employee> empList = Arrays.asList(empArr);
		System.out.println(empList);
		
		boolean result =empList.stream().anyMatch(emp -> emp.getDept().matches("IT"));
		if(result) {
			
			System.out.println("Employee Available");
		}else {
			System.out.println("Not Available");
		}
		
		Predicate<Employee> p1= emp1 -> emp1.getSalary()>50000&& emp1.getSalary()<90000;
		empList.stream().filter(p1).sorted(Comparator.comparing(Employee::getFname))
		.forEach(System.out::println);
		
		empList.stream().filter(p1).forEach(System.out::println);
		System.out.println(empList.stream().filter(p1).findFirst().get());
		
		
		Function<Employee, String> byFname = Employee::getFname;
		Function<Employee, String> byLname = Employee::getLname;
		/*
		 * public String fun(Emp1){
		 * 
		 * return emp1.getFname();
		 * 
		 * }
		 * 
		 * 
		 * */
		
		Comparator<Employee> byLastAndThenFirst =Comparator.comparing(byLname).thenComparing(byFname);
		
		empList.stream().sorted(byLastAndThenFirst).forEach(System.out::println);
		
		
		//System.out.print(empList.stream().collect(Collectors.groupingBy(Employee::getDept)));
		Map<String, List<Employee>> grpDept =empList.stream().collect(Collectors.groupingBy(Employee::getDept));
		
		grpDept.forEach((dep,empInDept) -> {
			System.out.println(dep);
			empInDept.forEach(System.out::println);
			
		});
		System.out.println("------------------------------------------------------");
		List<Employee> grp=empList.stream().filter(s -> s.getFname().startsWith("S")).collect(Collectors.toList());
		//System.out.println(grp);
		grp.forEach(System.out::println);
	}

}
