package com.mph.streamegs;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEgusing8 {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Car", "Bus", "Cycle", "", "Aeroplane", "", "Train");
		System.out.println("List of Vehicles :"+ strList);
		
		long count=strList.stream().filter(s -> s.isEmpty()).count();
		System.out.println("Count of Empty strings:" + count);
		
		long count1=strList.stream().filter(s -> s.length()==5).count();
		System.out.println("Count of length 5 strings:" + count1);
		
		List<String> filteredstr = strList.stream().filter(str -> !(str.length()==0)).collect(Collectors.toList());
		System.out.println("List of filtered elements: " + filteredstr);
		
		String mergestr = strList.stream().filter(str -> !(str.isEmpty())).collect(Collectors.joining(" * "));
		System.out.println("List of filtered elements: " + mergestr);
		
		List<Integer> intList= Arrays.asList(2,3,6,8,3,3,6,7);
		System.out.println("List of Integer: "+intList);
		
		List<Integer> sqList=intList.stream().map(i-> i*i).distinct().collect(Collectors.toList());
		System.out.println("Square list: "+ sqList);
		
		IntSummaryStatistics stats = intList.stream().mapToInt(i -> i).summaryStatistics();
		System.out.println(stats.getMax());
		System.out.println(stats.getMin());
		System.out.println(stats.getAverage());
		System.out.println(stats.getCount());
		System.out.println(stats.getSum());
		
	}

}
