package com.piyush.code;

import java.util.Arrays;

public class MinumumJumps {

	public static int jump(int[] a) {
		if (a[0] < 1)
			return -1;
		if (a[0] < a.length - 1) {
			System.out.println(a[0]+ " is less than "+ (a.length-1)+ " Taken jump to " + a[a[0]]);
			return 1 + jump(Arrays.copyOfRange(a, a[0], a.length ));
		} else {
			System.out.println("From "+ a[0] +" can jump to "+ (a[a.length-1]));
			return 1;}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = jump(new int[] { 47, 76, 55, 13, 2, 48, 46, 27, 12, 37, 99, 25, 48, 83, 20, 77, 13, 9, 35, 55, 62, 76,
				57, 18, 72, 64, 10, 4, 64, 74, 63, 77, 15, 18, 91, 84, 32, 36, 77, 10, 39, 75, 35, 87, 23, 22, 30, 37,
				31, 65, 58, 59, 7, 14, 78, 79, 45, 54, 83, 8, 94, 12, 86, 9, 97, 42, 93, 95, 44, 70, 5, 83, 10, 40, 36,
				34, 62, 66, 71, 59, 97, 95, 18, 3, 18, 62, 48, 19, 15, 98, 28, 8, 9 });
		System.out.println(c);
	}

}
