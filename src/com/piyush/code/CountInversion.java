package com.piyush.code;

public class CountInversion {

	public static int way1(int[] a) {
		int way = 0;

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j])
					way++;
			}
		}
		return way;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(way1(new int[] { 2, 4, 1, 3, 5 }));
		System.out.println(way1(new int[] { 2, 3, 4, 5, 6 }));
		System.out.println(way1(new int[] { 10, 10, 10 }));

	}

}
