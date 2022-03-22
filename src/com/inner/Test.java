package com.inner;

import com.inner.A.B;
import com.inner.A.B.C;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		 A.B b = a.new B();
		 A.B.C c = b.new C();
		 c.m1();
	}

}
