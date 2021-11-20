package com.piyush.code;

import java.util.Arrays;

public class MinumumJumps {

//	public static int jump(int[] a) {
//		if (a[0] < 1)
//			return -1;
//		if (a[0] < a.length - 1) {
//			System.out.println(a[0]+ " is less than "+ (a.length-1)+ " Taken jump to " + a[a[0]]);
//			return 1 + jump(Arrays.copyOfRange(a, a[0], a.length ));
//		} else {
//			System.out.println("From "+ a[0] +" can jump to "+ (a[a.length-1]));
//			return 1;}
//	}
//	
//	public static int jump2(int[] a) {
//		
//		int count=0;
//		int pos=0;
//		while(pos<a.length-1) {
//			if (a[pos] < 1)
//				return -1;
//			pos=pos+a[pos];
//			count++;
//		}
//		return count;
//		
//		
	public static int jump(int[] a) {
		int pos = 0;
		int count = 0;
		while (pos < a.length - 1) {
			int maxnum = a[pos + 1];
			int maxpos;
			for (int i = pos + a[pos]; i > pos; i--) {
				if (a[i] > maxnum) {
					maxnum = a[i];
					maxpos = i;
				}
			}
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = jump(new int[] { 47, 76, 55, 13, 2, 48, 46, 27, 12, 37, 99, 25, 48, 83, 20, 77, 13, 9, 35, 55, 62, 76,
				57, 18, 72, 64, 10, 4, 64, 74, 63, 77, 15, 18, 91, 84, 32, 36, 77, 10, 39, 75, 35, 87, 23, 22, 30, 37,
				31, 65, 58, 59, 7, 14, 78, 79, 45, 54, 83, 8, 94, 12, 86, 9, 97, 42, 93, 95, 44, 70, 5, 83, 10, 40, 36,
				34, 62, 66, 71, 59, 97, 95, 18, 3, 18, 62, 48, 19, 15, 98, 28, 8, 9 });
		System.out.println(c);
		// int d= jump2(new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9});
		int d = jump(new int[] { 2, 3, 1, 1, 2, 4, 2, 0, 1, 1 });
		System.out.println(d);
	}

}
