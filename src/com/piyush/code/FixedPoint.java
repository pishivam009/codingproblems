package com.piyush.code;

public class FixedPoint {

	public static void way1(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == i + 1)
				
				System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		way1(new int[] { 15, 2, 45, 12, 7 });
	}
}
