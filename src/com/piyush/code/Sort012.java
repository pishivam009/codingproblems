package com.piyush.code;

public class Sort012 {

	public static int[] way1(int[] a) {

		int[] b = new int[a.length];
		for (int i = 0; i < b.length; i++)
			b[i] = 1;
		int c0 = 0, c2 = b.length - 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0)
				b[c0++] = 0;
			if (a[i] == 2)
				b[c2--] = 2;
		}

		return b;
	}

	public static void way2(int a[]) {
		// code here
		String s = "";
		int[] b = new int[a.length];
		int c0 = 0, c1 = 0, c2 = 0;
		for (int k : a) {
			switch (k) {
			case 0:
				c0++;
				break;
			case 1:
				c1++;
				break;
			case 2:
				c2++;
				break;
			}
		}
		int i = 0;
		while (i < b.length - 2) {
			while (c0-- > 0) {
				b[i++] = 0;
			}
			while (c1-- > 0) {
				b[i++] = 1;
			}
			while (c2-- > 0) {
				b[i++] = 2;
			}
		}

		for (int k : b)
			s += k + " ";
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] o = way1(new int[] { 0, 1, 0 });
		for (int x : o)
			System.out.println(x);
		way2(new int[] { 0, 2, 1, 2, 0 });
	}

}
