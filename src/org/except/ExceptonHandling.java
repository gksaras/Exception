package org.except;

import java.util.InputMismatchException;

public class ExceptonHandling {

	public static void main(String[] args) {
	
	// 1. try and catch block
	System.out.println("start");
	try {
		System.out.println(5/0);
	} 
	catch (ArithmeticException e) {
		System.out.println("can't divide by zero");
	}
	System.out.println("end");
	System.out.println();
	
	// 2. try,catch and finally block
	System.out.println("start");
	try {
		System.out.println(2/0);
	} 
	catch (ArithmeticException e) {
		System.out.println("can't / by 0");
	} 
	finally {
		System.out.println("Finally");
	}
	System.out.println("end");
	System.out.println();	
	
	// 3. try and finally block
	System.out.println("start");
	try {
		System.out.println(4/2);
	} 
	finally {
		System.out.println("Finally");
	}
	System.out.println("end");
	System.out.println();
	
	// 4. try and multipe catch block
	System.out.println("start");
	try {
		System.out.println(4/0);
	} 
	catch (NullPointerException e1) {
		System.out.println("null value");
	}
	catch (StringIndexOutOfBoundsException e2) {
		System.out.println("String Length is exceeded");
	}
	catch (ArrayIndexOutOfBoundsException e3) {
		System.out.println("Array size is exceeded");
	}
	catch (ArithmeticException e4) {
		System.out.println("divide by 0 error");
	}
	catch (IndexOutOfBoundsException e5) {
		System.out.println("list reached the limit");
	}
	catch (NumberFormatException e6) {
		System.out.println("String contains Numeric value");
	}
	catch (InputMismatchException e7) {
		System.out.println("Incorrect input");
	}
	System.out.println("end");
	System.out.println();
	
	// 5. Super class of all exceptions example
	System.out.println("start");
	try {
		System.out.println(4/0);
	} 
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Array index reached the limit");
	}
	catch (IndexOutOfBoundsException e) {
		System.out.println("list reached the limit");
	}
	catch (NullPointerException e) {
		System.out.println("String Length is exceeded");
	}
	catch (Exception e) // Exception is a super class of all exception 
	{					// It should be specified at last only
						// It is automatically execute even if the exception not found
		System.out.println("can't divide by 0");
	}
	System.out.println("end");
	System.out.println();
	
	// 6. Nested try block
	System.out.println("start");
	try {
		System.out.println(4/0);
		try {
			String s = null;
			System.out.println(s.charAt(2));
		} 
		catch (NullPointerException e) {
			System.out.println("null value");
		}
		finally {
			System.out.println("Inner finally");
		}
	} 
	catch (ArithmeticException e) {
		System.out.println("cannot divided by zero");
	}
	finally {
		System.out.println("Outer finally");
	}
	System.out.println("end");
	System.out.println();
	
	// 7. nested try example using super class - Exception e
	System.out.println("start");
	try {
		System.out.println(4/2);
		try {
			String st = "greens";
			System.out.println(st.charAt(7));
		} 
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("String Index exceeded");
		}
		finally {
			System.out.println("Inner finally");
		}
	} 
	catch (Exception e) // This exception occurs even if the exception not occurs
	{
		System.out.println("cannot divided by zero");
	}
	finally {
		System.out.println("Outer finally");
	}
	System.out.println("end");
	}
}
