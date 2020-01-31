package org.hexaware;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.cts.test.SampleClass1;
//import packageName.ClassName;


public class SeleniumClass {

	
	
	public static void main(String[] args) {
	
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		
		try { //Outer Try
			System.out.println("I am outer try");
		 System.out.println(5);
			 
		 try {  //Inner Try
			 System.out.println("I am inner try");
			 System.out.println(8/0);
			 System.out.println("Kalai");
			 
		 
			
		}
		catch(ArithmeticException e) { //Inner Catch
			System.out.println("Inner catch");
		}
		
		finally { //Inner finally
			System.out.println("I am inner finally");
			
		}
	}
		
		catch(Throwable e) {  //Outer Catch
			e.printStackTrace();
			String msg = e.getMessage();
			System.out.println(msg);
			System.out.println("I am outer catch");
			}
		
		
		finally {
			System.out.println("I am outer finally");
			System.out.println(6);
		}
		
		
		
	
		
		
	
		
		
		
		
		
	}
}
