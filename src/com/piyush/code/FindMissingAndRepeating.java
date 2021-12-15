package com.piyush.code;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class FindMissingAndRepeating {

	public static void way1(int[] a) {
		int[] map = new int[a.length];
		int missing = 0, repeated = 0;
		for (int i = 0; i < a.length; i++) {
			map[a[i] - 1]++;
		}
		for (int i = 0; i < a.length; i++) {
			if (map[i] == 0)
				missing = i + 1;
			if (map[i] == 2)
				repeated = i + 1;
		}

		System.out.println("" + missing + " " + repeated);
	}

	public static void way2(int[] a) {

		Arrays.sort(a);
		int missing = 0, repeated = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] == a[i])
				repeated = a[i];
			if (a[i - 1] + 1 != a[i])
				missing = a[i] - 1;
		}
		System.out.println("" + missing + " " + repeated);
	}

	public static void way3(int[] a) {

		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		int missing = 0, repeated = 0;
		for (int i : a) {
			if(!map.containsKey(i)) map.put(i, 1);
			else {
				map.put(i, map.get(i)+1);
			}
		}
		for (int i=1; i<=a.length;i++) {
			if(map.get(i)==null) missing=i;
			if(map.get(i)==Integer.valueOf(2)) repeated=i;
		}
		System.out.println("" + missing + " " + repeated);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		way3(new int[] { 1, 3, 3 });
	}

}
