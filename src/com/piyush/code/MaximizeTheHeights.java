package com.piyush.code;

import java.util.Arrays;

public class MaximizeTheHeights {

//	public static int way1(int[] a, int k) {
//
//		Arrays.sort(a);
//		int diff = a[a.length - 1] - a[0];
//		int largest = a[a.length - 1] - k;
//		int smallest = a[0] + k;
//		int max, min;
//
//		for (int i = 1; i < a.length-1; i++) {
//			max = Math.max(a[i] + k, largest);
//			min = Math.min(a[i + 1] - k, smallest);
//			if (min < 0)
//				continue;
//			else
//				diff = Math.min(diff, max - min);
//		}
//
//		return diff;
//	}
	
	public static int way1(int[]a,int k) {
		Arrays.sort(a);
		int diff=a[a.length-1]-a[0]; 
		if (diff<k) return diff; //find current difference between the extremes
		int smallest=a[0]+k, largest=a[a.length-1]-k; //operations on extremes-> increase the lowest, decrease the highest
		for(int i=0; i<a.length/2-1;i++) {
			smallest=Math.max(smallest, a[i]+k); //increase the smallest
			largest=Math.min(largest, a[a.length-1-i]-k); //increase left half, decrease right half. Middle element???
			if(largest<k) break;
			
		}
//		if(a.length%2!=0) {
//			if(a[a.length/2]+k>largest)	
//		}
		
		
		diff=Math.min(largest-smallest, diff);
		return diff;
	}

	public static void main(String[] args) {
		int[] a = { 3, 9, 21, 16, 20 };
//		int[]	b= {5, 5, 5, 5,51};
		System.out.println(way1(a,2));
	}
}
