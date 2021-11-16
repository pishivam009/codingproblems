package com.piyush.code;

public class ReverseAString {

	public static char[] way1(char[] a) {

		for (int i = 0; i < a.length / 2 - 1; i++) {
			char temp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = temp;
		}

		return a;
	}

	public static String reverseString(String s) {
	int l=s.length();
	if(l<=1) return s;
	String left=s.substring(0, l/2);
	String right=s.substring(l/2,l);
	return reverseString(right)+reverseString(left); //break in half, then left right swap (on a recursive level)
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new String(way1(new char[] { 'h', 'e', 'l', 'l', 'o' })));
		System.out.println(reverseString("hello"));

	}

}
