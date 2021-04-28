package com.mph.extra;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassEg {

	public static String getStringValue(List<String> list) {
		Optional<String> opstr=list.stream().filter(str -> str.startsWith("C")).findFirst();
		return opstr.isPresent() ? opstr.get() :"No Strings available";
	}
	public static void main(String[] args) {
		
		List<String> strList = Arrays.asList("Rat","Cat","","Tiger","Dog","Cheetah","");
		System.out.println(strList);
		
		System.out.println(getStringValue(strList));
	}

}
