package com.piyush.code;

import java.util.Scanner;

public class ReverseArray {

	static String way1(char[] a) {

		for (int i = 0; i <= a.length / 2 - 1; i++) {
			char temp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = temp;
		}

		return new String(a);

	}

	static String way2(char[] a) {
		String temp = "";
		for (int i = a.length - 1; i >= 0; i--) {
			temp += a[i];
		}

		return temp;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(way1(s.toCharArray()));
		System.out.println(way2(s.toCharArray()));
		sc.close();
	}

}
