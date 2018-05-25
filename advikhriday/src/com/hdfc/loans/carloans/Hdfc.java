package com.hdfc.loans.carloans;

public class Hdfc implements Rbi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hdfc obj=new Hdfc();
		obj.withdrawl();
	}

	@Override
	public void withdrawl() {
		// TODO Auto-generated method stub
		System.out.println("hi iam withdrawl overrriden method in class hdfc");
	}

}
