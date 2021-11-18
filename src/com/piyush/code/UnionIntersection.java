package com.piyush.code;

import java.util.HashSet;
import java.util.Set;

public class UnionIntersection {
	public static void way1(int[] a, int[] b) {
		Set<Integer> union = new HashSet<Integer>();
		//Set<Integer> intersection = union; //refers to union only, gives wrong result
		Set<Integer> intersection= new HashSet<Integer>();
		for (int k : a)
			union.add(k);
		for (int k : b) {
			if (!union.contains(k))
				union.add(k);
			else
				intersection.add(k);
		}
		System.out.println(union);
		System.out.println( intersection);
	}
	
	 /// solve without using Set API

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		way1(new int[] {1,2,3,4,5},new int[] {1,2,3});
	}

}
