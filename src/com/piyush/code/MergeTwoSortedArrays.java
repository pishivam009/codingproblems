package com.piyush.code;

import java.util.Arrays;

public class MergeTwoSortedArrays {
	public static void way1(int[] a, int[] b) {
		// for (int j = 0; j < b.length; j++) {
		int j=0;
		for (int i = a.length-1; i >= 0; i--) {
			if (a[i] > b[j]) {
				int temp = a[i];
				a[i] = b[j];
				b[j] = temp;
			} else break;
			
			j++;
		}
		// }
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.stream(a).forEach(System.out::println);
		Arrays.stream(b).forEach(System.out::println);
	}
	
	public static void way2(int[] a, int[] b) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		way1(new int[] { 1, 5, 6, 7 }, new int[] { 0, 2, 3, 8, 9 });

	}

}
