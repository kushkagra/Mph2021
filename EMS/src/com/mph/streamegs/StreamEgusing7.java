package com.mph.streamegs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamEgusing7 {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Car", "Bus", "Cycle", "", "Aeroplane", "", "Train");
		System.out.println("List of Vehicles :" + strList);

		long count = getCountOfEmptyStrings(strList);
		System.out.println("Count of Empty strings: " + count);

		long count1 = getStrWithLength5(strList);
		System.out.println("String with Length 5 : " + count1);
		
		List<String> filteredStr =deleteEmptyStrAndPrintOtherStrings(strList);
		System.out.println("Filtered Str :" + filteredStr);
		
		List<Integer>  intList =Arrays.asList(3,2,5,3,7,6,1,2,3);
		System.out.println("List of Integers :" + intList);
		
		System.out.println("Highest number in the List : " + getMax(intList));
		System.out.println("Smallest number in the List : " + getMin(intList));
		System.out.println("Sum of numbers in the List : " + getSum(intList));
		System.out.println("Square of numbers in the List : " + getSqr(intList));
		
	}
	/*
	private static int getSqr(List<Integer> intList) {
		int sqr =intList.get(0);
		for(int i=0;i<intList.size();i++) {		
			//sum=sum+(int)intList.get(i);
			sqr=(int)intList.get(i)*(int)intList.get(i);
			
		}
		return sqr;
	}*/
	
	   private static List<Integer> getSqr(List<Integer> intList) {
	        List<Integer>  sqrList = new ArrayList<Integer>();
	        for(int i=0;i<intList.size();i++) {
	            int s =intList.get(i);
	            sqrList.add(s*s);
	            
	        }
	        
	        return sqrList ;
	    }
	
	private static int getSum(List<Integer> intList) {
		int sum =intList.get(0);
		for(int i=1;i<intList.size();i++) {		
			//sum=sum+(int)intList.get(i);
			sum+=(int)intList.get(i);
		}
		return sum;
	}

	private static int getMin(List<Integer> intList) {
		int min = intList.get(0);					
		for(int i=1;i<intList.size();i++) {			
			Integer wi =intList.get(i);				
			if(wi.intValue()<min)					
			{
				min=wi.intValue();
			}
		}
		
		return  min;
	}

	private static int getMax(List<Integer> intList) {
		int max = intList.get(0);					
		for(int i=1;i<intList.size();i++) {			
			Integer wi =intList.get(i);				
			if(wi.intValue()>max)					
			{
				max=wi.intValue();
			}
		}
		
		return  max;
	}

	private static List<String> deleteEmptyStrAndPrintOtherStrings(List<String> strList) {
		List<String> fList = new ArrayList<String>();

		for (String s : strList) {
			if (!(s.isEmpty())) {
				fList.add(s);
			}
		}

		return fList;
	}

	private static long getStrWithLength5(List<String> strList) {
		long count = 0;

		for (String s : strList) {
			if (s.length()==5) {
				count++;
			}
		}

		return count;
	}

	private static long getCountOfEmptyStrings(List<String> strList) {
		long count = 0;

		for (String s : strList) {
			if (s.isEmpty()) {
				count++;
			}
		}

		return count;

	}

}
