package com.piyush.code;

import java.util.Arrays;

public class AllNegativeToBeginning {

	public static int[] way1(int[] a) {
		int[] b = new int[a.length];
		int neg = 0, pos = a.length - 1;

		for (int k : a) {
			if (k < 0)
				b[neg++] = k;
			else
				b[pos--] = k;
		}

		return b;
	}

	public static int[] way2(int[] arr) {

		int j = 0, temp; // j denotes positions already filled in array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				// if (i != j) { //don't swap if at same position
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				// }
				j++;
			}
		}

		return arr;
	}

	public static int[] way3(int[] arr) {

		int left = 0, right = arr.length - 1;

		while (left <= right) {
			if (arr[left] < 0 && arr[right] < 0)
				left++;
			else if (arr[left] > 0 && arr[right] < 0) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			} else if (arr[left] > 0 && arr[right] > 0)
				right--;
			else {
				left++;
				right--;
			}
		}

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays.stream(way3(new int[] { 1, 2, -3, 4, 5, 6, -7, 8, 9, 0, -9, -12, 11, -13, -5, 6, -7, 5, -3, 11 }))
				.forEach(System.out::println);

	}

}
