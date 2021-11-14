package com.piyush.code;

public class MaxMinOfArray {

	public static int[] way1(int[] a) {
		int max=a[0];
		int min=a[0];
		
		for(int i=0; i<a.length;i++) {
			if(a[i]>max) max=a[i];
			if(a[i]<min) min=a[i];
		}
		
		return new int[]{max,min};
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=way1(new int[] {3,5,9,7,8,3,1,4,5});
		System.out.print("Max="+a[0]+" Min="+a[1]);
	}

}
