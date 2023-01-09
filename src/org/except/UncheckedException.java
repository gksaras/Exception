package org.except;

import java.util.ArrayList;
import java.util.List;

// Unchecked Exception or Run time Exception
// Exception is present in java.lang package

public class UncheckedException {

	public static void main(String[] args) {
		
	/*	// 1.Arithmetic Exception
		int a = 5;
		System.out.println(a/0);	
		
		// 2.null pointer Exception
		String s = null;
		System.out.println(System.identityHashCode(s));
		char charAt = s.charAt(0);
		System.out.println(charAt); 	
		
		// 3.Input mismatch Exception
		
		// 4.ArrayIndexOutOfBounds Exception
		int a[] = new int[5];
		System.out.println(a[5]);	
		
		// 5.StringIndexOutOfBounds Exception
		String s = "greens";
		System.out.println(System.identityHashCode(s));
		char charAt = s.charAt(7);
		System.out.println(charAt);		*/
		
		// 6.IndexOutOfBounds Exception
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(50);
		l.add(60);
		l.add(30);
		System.out.println(l);
		System.out.println(l.get(5));	
		
		// 7.NumberFormat Exception
	/*	String a = "123";
		System.out.println(a+10);
		
		int parseInt = Integer.parseInt(a);
		System.out.println(parseInt+10);
		
		String b = "12gt3";
		System.out.println(b+10);
		
		int parseInt2 = Integer.parseInt(b);
		System.out.println(parseInt2+10);  */
	}
}
