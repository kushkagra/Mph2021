package com.mph.extra;

public class StaticOuterClass {
	
	static int x=88;
	static class InnerClass{
		int y =990;
		public void sInnerMethod() {
			System.out.println("x in inner method "+x+ " "+y);
		}
	}
	public static void main(String args[]) {
		StaticOuterClass oc = new StaticOuterClass();
		StaticOuterClass.InnerClass sic = new StaticOuterClass.InnerClass();
		sic.sInnerMethod();
	}
}
