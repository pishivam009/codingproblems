package com.piyush.code;

import java.util.Map;
import java.util.TreeMap;

public class ArraySubset {

	public static boolean way1(int[] a, int[] b) {
		int count = 0;
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i : a) {
			if (!map.containsKey(i))
				map.put(i, 1);
			else
				map.put(i, map.get(i) + 1);
		}
		for (int i : b) {
			if (map.get(i) == null || (int) map.get(i) < 1)
				return false;
			else {
				count++;
				map.put(i, map.get(i) - 1);
			}
		}
		//System.out.println(map);
		if (count == b.length)
			return true;

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(way1(new int[] { 11, 1, 13, 21, 3, 7 }, new int[] { 11, 3, 7, 1 }));

	}

}
