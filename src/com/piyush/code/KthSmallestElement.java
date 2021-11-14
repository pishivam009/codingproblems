package com.piyush.code;

import java.util.Arrays;

public class KthSmallestElement {
	public static int way1(int[] a, int k) {
	
		Arrays.sort(a);
		
		return a[k-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(way1(new int[] {7, 10, 4, 3, 20, 15}, 3));
	}

}
