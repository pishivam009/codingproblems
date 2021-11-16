package com.piyush.code;

import java.util.Arrays;

public class DuplicateInAnIntegerArray {

	public static int way1(int[] a) {
		int[] b = new int[a.length + 1];

		for (int k : a) {

			if (b[k] == 0)
				b[k] = k;

			else
				return k;
		}
		return -1;
	}

	public static int way2(int[] a) {
		Arrays.sort(a);
		for (int i = 1; i < a.length; i++) {
			if (a[i] == a[i - 1])
				return a[i];
		}

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(way2(new int[] { 7, 9, 7, 4, 2, 8, 7, 7, 1, 5 }));
	}

}
