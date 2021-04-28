package com.mph.extra;

import com.mph.extra.MyOuter.MyInner;

public class MethodInner {

	int x=900;
	public void OuterMethod() {
		int y = 90;
		class MyInnerClass{
			int z =990;
			public void InnerMethod() {
				System.out.println("x in inner method "+x+ " "+y);
			}
		}
		//System.out.println("z"+z);
		MyInnerClass mc = new MyInnerClass();
		mc.InnerMethod();
	}
	public static void main(String[] args) {
		MethodInner mo = new MethodInner();
		mo.OuterMethod();
		
		//MyInnerClass mc = mo.new MyInner();
		//mc.InnerMethod();
		
	}

}
