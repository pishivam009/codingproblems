package com.piyush.code;

public class MaximumProductSubarray {

	public static int way1(int[] a) {
		int maxsofar = a[0], globalmax = a[0];

		for (int i = 1; i < a.length; i++) {
			// maxsofar;

			if (maxsofar * Math.abs(a[i]) > globalmax)
				globalmax = maxsofar* Math.abs(a[i]);
			else {
				maxsofar = a[i];
			}
			globalmax = Math.max(maxsofar, globalmax);

		}

		return globalmax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(way1(new int[] { 6, -3, -10, 0, 2 }));
	}

}
