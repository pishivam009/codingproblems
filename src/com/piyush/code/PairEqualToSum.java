package com.piyush.code;

import java.util.Map;
import java.util.TreeMap;

public class PairEqualToSum {

	public static int way1(int[] a, int n) {
		int c = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == n)
					c++;
			}
		}
		return c;
	}

	public static int way2(int[] a, int k) {
		int c = 0;

		Map<Integer, Integer> m = new TreeMap<Integer, Integer>();

		for (int i : a) { // store the complementary number. If it exists, means we've found the number we
							// require
			if (!m.containsKey(i)) {
				m.put(i, 1);
			} else {
				m.put(i, m.get(i) + 1);
			}
		}
		for (int i : a) {
			if (i == k / 2) {
				if (m.containsKey(k - i))
					c += (m.get(k-i)*(m.get(k-i)-1) / 2)/2;  // if two halves, then it searches for itself, gives wrong value
									//so total pairs will be n*n-1/2 as here {1,1,1,1}
			} else {
				if (m.containsKey(k - i))
					c += m.get(k-i);
			}
		}

		return c/2; //because for complimentary pairs, count is doubled
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(way2(new int[] { 1, 5, 7, 1 }, 6));
		System.out.println(way2(new int[] { 1, 1, 4, 4 }, 2));
	}

}
