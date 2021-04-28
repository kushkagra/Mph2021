package com.mph.streamegs;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamEg {

	public static void main(String[] args) {
		int[] intList= {4,6,3,8,5,2,7,4,9};
		System.out.println("Array of Integer: "+ Arrays.toString(intList));
		
		//IntStream.of(intList).forEach(li -> System.out::println(li));
		IntStream.of(intList).forEach(System.out::println);
		
		System.out.println("Total Count " + IntStream.of(intList).count());
		System.out.println("Total Count " + IntStream.of(intList).max().getAsInt());
		System.out.println("Total Count " + IntStream.of(intList).min().getAsInt());
		System.out.println("Total Count " + IntStream.of(intList).sum());
		System.out.println("Total Count " + IntStream.of(intList).average().getAsDouble());
		
		IntStream.of(intList).filter(val -> val%2==0).sorted().forEach(System.out::println);
		
		System.out.println("Range -----" + IntStream.range(1,5).sum()); //1+2+3+4
		System.out.println("Range -----" + IntStream.rangeClosed(1,5).sum()); //1+2+3+4+5
		
		int[] va = {1,2,3,4,5};
		System.out.println("Reduce --"+ IntStream.of(va).reduce(1, (x,y)->(x+y))); //0+1 = 1+2 =3+3
	}

}
