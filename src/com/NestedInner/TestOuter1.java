package com.NestedInner;

public class TestOuter1 {
	static int data = 30;
	static class inner{
		void msg() {
			System.out.println("Data is: " +data);}
	}
	public static void main(String[] args) {
		TestOuter1.inner obj = new TestOuter1.inner();
		obj.msg();
	}

}
