package com.java8.lambda;

public class LambdaTest {
	
	public static void main(String[] args) {
		System.out.println("main Started!");
		Runnable r=()->{
			System.out.println("Runnable");
		};
		
		Thread t1=new Thread(r);
		t1.start();
		
		System.out.println("Main Complete");
	}

}
