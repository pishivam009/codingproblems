package com.piyush.code;

public class CountSquares {
	public static int way1(int n) {
		double sqrt = Math.sqrt(n);
		return sqrt == (int) sqrt ? (int) sqrt - 1 : (int) sqrt;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(way1(36));
	}

}
