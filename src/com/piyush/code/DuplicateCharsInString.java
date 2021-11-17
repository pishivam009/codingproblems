package com.piyush.code;

import java.util.Arrays;
import java.util.TreeMap;

public class DuplicateCharsInString {

	public static void way1(String a) {
		int[] b=new int[26];
		for(char i:a.toLowerCase().toCharArray()) {
			b[i-'a']++;
			if(b[i-'a']>1) System.out.println(i);
		}
	}
	public static void way2(String a) {
		TreeMap<Character,Integer> map= new TreeMap<Character,Integer>();
		for(char k: a.toLowerCase().toCharArray()) {
			if(map.containsKey(k))
			map.put(k, map.get(k)+1);
			else map.put(k, 1);
		}
		//map.entrySet().stream().filter((k,v)->v>1)
		//think how stream and lambda functions can be added
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		way1("HelloHi");

	}

}
