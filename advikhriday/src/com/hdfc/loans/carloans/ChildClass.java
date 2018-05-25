package com.hdfc.loans.carloans;

public class ChildClass extends AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj=new ChildClass();
		obj.m1();
		obj.m2();
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 over ride in abstractclass");
	}

}
