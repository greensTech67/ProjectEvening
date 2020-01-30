package org.cts.test;

public class SampleClass1  {
	
	
	protected void method1() {
		System.out.println("method1");
		
	}
	
	
	public void method2() {
		System.out.println("method2");

	}
	private void method3() {
		System.out.println("method3");

	}
	
	public static void main(String[] args) {
		
		SampleClass1 obj = new SampleClass1();
		obj.method1();
		obj.method2();
		obj.method3();
	}

}
