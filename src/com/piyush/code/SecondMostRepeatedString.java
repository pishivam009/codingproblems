package com.piyush.code;

import java.util.*;

public class SecondMostRepeatedString {

	public static String way1(String[] a) {

		Map<String, Integer> m = new HashMap<String, Integer>();

		for (String k : a) {
			if (!m.containsKey(k))
				m.put(k, 1);
			else
				m.put(k, m.get(k) + 1);

		}
		System.out.println(m);
		List<Integer> l = new LinkedList<Integer>(m.values());
		Collections.sort(l);

		return getKey(m, l.get(l.size() - 2));
	}

	public static String getKey(Map<String, Integer> m, Integer n) {
		for (String k : m.keySet())
			if (n.equals(m.get(k)))
				return k;

		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(way1(new String[] { "aaa", "bbb", "ccc", "bbb", "aaa", "aaa" }));
	}

}
