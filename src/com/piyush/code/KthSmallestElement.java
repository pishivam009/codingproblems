package com.piyush.code;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthSmallestElement {
	public static int way1(int[] a, int k) {
	
		Arrays.sort(a);
		
		return a[k-1];
	}
	public static int way2(int[] a, int k) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for (int x : a) pq.add(x);
		//for(int x : pq) System.out.println(x);
		for (int i=0; i<k-1;i++) {
			pq.remove();
		}
		return pq.peek();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(way1(new int[] {7, 10, 4, 3, 20, 15, 25, 1}, 3));
		System.out.println(way2(new int[] {7, 10, 4, 3, 20, 15, 25, 1}, 3));
	}

}
