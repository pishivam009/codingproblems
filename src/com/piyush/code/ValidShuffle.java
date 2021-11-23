package com.piyush.code;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public class ValidShuffle {

	public static boolean way1(String a, String b, String c) {
		char[] d = (a + b).toCharArray();
		char[] e = c.toCharArray();
		if (d.length == e.length) {
			Arrays.sort(d);
			Arrays.sort(e);

			if (Arrays.equals(d, e))
				return true;
		}

		return false;
	}

	public static boolean way2(String a, String b, String c) {

		TreeMap<Character, Integer> m1 = new TreeMap<Character, Integer>();
		TreeMap<Character, Integer> m2 = new TreeMap<Character, Integer>();
		if ((a + b).length() == c.length()) {

			for (char x : (a + b).toCharArray()) {

				if (!m1.containsKey(x))
					m1.put(x, 1);
				else
					m1.put(x, m1.get(x) + 1);
			}

			for (char x : c.toCharArray()) {

				if (!m2.containsKey(x))
					m2.put(x, 1);
				else
					m2.put(x, m1.get(x) + 1);
			}

			if (m1.equals(m2))
				return true;
		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(way2("XY", "12", "X12Y"));
	}

}
