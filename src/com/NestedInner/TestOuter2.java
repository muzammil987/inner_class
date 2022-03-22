package com.NestedInner;

public class TestOuter2 {
	static int age = 20;
	static class Inner{
		static void msg() {
			System.out.println("data is: " +age);
			
		}
		
	}
	public static void main(String[] args) {
		TestOuter2.Inner.msg();
	}

}
