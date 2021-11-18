package com.piyush.code;

import java.util.Arrays;

public class CyclicRotateByOne {

	public static int[] way1(int[] a) {
		int temp=a[a.length-1];
		for(int i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
		}
		a[0]=temp;
		
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays.stream(way1(new int[] {9, 8, 7, 6, 4, 2, 1, 3})).forEach(System.out::println);
	}

}
