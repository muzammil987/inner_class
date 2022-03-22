package com.Local;

public class Test1 {
	int x = 10;
	static int y = 20;  // --------
	public void m1() {   /*if we declare inner class inside  static method then we can access only static members of outer class directly  */
		class Inner{
			public void m2() {
				System.out.println(x);  // CE
				System.out.println(y);
			}
		}
		
		Inner i = new Inner();
		i.m2();
	}
	
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.m1();
	}
	

}
