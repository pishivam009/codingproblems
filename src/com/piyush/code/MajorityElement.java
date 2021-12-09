package com.piyush.code;

import java.util.Map;
import java.util.TreeMap;

public class MajorityElement {

	public static int way1(int[]a) {
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		for (int i : a) {
			if(!map.containsKey(i)) map.put(i, 1);
			else {
				map.put(i, map.get(i)+1);
			}
		}
		for (int i : map.keySet()) {
			if(map.get(i)>a.length/2) return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(way1(new int[]{3,1,3,3,2}));

	}

}
