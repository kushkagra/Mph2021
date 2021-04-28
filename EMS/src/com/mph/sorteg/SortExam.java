package com.mph.sorteg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortExam {

	public static void main(String[] args) {
		int[] intArr = {5,6,7,3,2};
		Arrays.sort(intArr);
		System.out.println("Sorted intArr:"+Arrays.toString(intArr));
		
		String[] strArr= {"Kush","Deep","Meet","Preet"};
		Arrays.sort(strArr);
		System.out.println("Sorted strArr:"+Arrays.toString(strArr));
	
		List<String> strList =new ArrayList<String>(); 
			strList.add("Kush");
			strList.add("Deep");
			strList.add("Arla");
			strList.add("Ram");
			
			System.out.println("StrList:"+strList);
			Collections.sort(strList);
			System.out.println("Sorted strList:"+strList);
			
			Student[] stArray =new Student[3];
			stArray[0] =new Student(10,"Kush",25,90);
			stArray[1] =new Student(30,"Himaja",27,80);
			stArray[2] =new Student(20,"Bhavana",22,95);

			Arrays.sort(stArray);
			System.out.println("Sorted Student Array:"+Arrays.toString(stArray));
	
			Arrays.sort(stArray,Student.nameComparator);
			System.out.println("Sorted Student Array w.r.t Name: "+Arrays.toString(stArray));
	
			Arrays.sort(stArray,Student.ageComparator);
			System.out.println("Sorted Student Array w.r.t Age:"+Arrays.toString(stArray));
	
	}

}
