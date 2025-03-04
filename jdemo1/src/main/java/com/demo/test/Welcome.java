package com.demo.test;

import com.demo.service.DemoTest;

public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to java");
		System.out.println(DemoTest.message);
		System.out.println(new DemoTest().getMessage());
	}

}
