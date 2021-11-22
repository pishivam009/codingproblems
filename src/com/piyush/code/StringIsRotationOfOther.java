package com.piyush.code;

import java.util.LinkedList;
import java.util.Queue;

public class StringIsRotationOfOther {

	public static boolean way1(String a, String b) { // check if b is rotation of a
		String c = a + a;
		if (a.length() == b.length() && c.contains(b))
			return true;
		return false;
	}

	public static boolean way2(String a, String b) {
		Queue<Character> q1 = new LinkedList<Character>();
		Queue<Character> q2 = new LinkedList<Character>();
		//a= new StringBuilder(a).reverse().toString();
		//b= new StringBuilder(b).reverse().toString();
		for (char c : a.toCharArray())
			q1.add(c);
		for (char c : b.toCharArray())
			q2.add(c);
		for(int i=0; i<a.length();i++) {
			char c=q1.peek();
			q1.remove();
			q1.add(c);
			if(q1.equals(q2))return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(way2("hello", "ohell"));
	}

}
