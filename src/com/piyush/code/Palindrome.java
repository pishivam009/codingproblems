package com.piyush.code;

public class Palindrome {

	public static void way1(String a) {
		String flag="Palindrome";
		for(int i=0; i<a.length();i++) {
			if(a.charAt(i)!=a.charAt(a.length()-i-1)) {
				flag="Not palindrome";
				break;
			}
		}
		System.out.println(flag);
	}
	public static void way2(String a) {
		StringBuilder b= new StringBuilder(a).reverse();
		if(a.equals(b.toString())) System.out.println("Palindrome");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		way2("racecar");
	}

}
