package com.piyush.code;

import java.util.Map;
import java.util.TreeMap;

public class LessThanNByK {

	public static void way1(int[] a, int k) {
		int limit = a.length / k;
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i : a) {
			if (!map.containsKey(i))
				map.put(i, 1);
			else {
				map.put(i, map.get(i) + 1);
			}
		}
		for (int i:map.keySet()) {
			if ((int)map.get(i) > limit)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		way1(new int[] { 1, 1, 2, 2, 3, 5, 4, 2, 2, 3, 1, 1, 1 }, 4);
	}

}
