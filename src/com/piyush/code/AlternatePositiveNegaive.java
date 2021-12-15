package com.piyush.code;

import java.util.Arrays;

public class AlternatePositiveNegaive {

	
	public static int[] way1(int[] a) {
		Arrays.sort(a);
		int negpos=0; //swapping to keep negative numbers at even places 0,2,4
		for(int i=0; i<a.length-1;i++) {
			if((a[i]<0)&& (i%2==0)) negpos+=2; //if already a negative at even
			
		}
		
		
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
