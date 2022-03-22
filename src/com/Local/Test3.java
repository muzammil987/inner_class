package com.Local;

public class Test3 {
	public void m1() {
		final int x = 10;
		 class Inner{
			 public void m2() {
				 System.out.println(x);
			 }
		 }
		 Inner i = new Inner();
		 i.m2();
	}
	public static void main(String[] args) {
		Test3 t = new Test3();
		t.m1();
	}

}
