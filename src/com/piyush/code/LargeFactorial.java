package com.piyush.code;

import java.math.BigInteger;

public class LargeFactorial {

	public static BigInteger fact(int a) {
		BigInteger[] fact = new BigInteger[a + 1];
		fact[0] = new BigInteger("1");
		fact[1] = new BigInteger("1");

		for (int i = 2; i <= a; i++) { //works till fact14 because of int issue
			fact[i] = fact[i-1].multiply(new BigInteger(i+""));
		}

		return fact[a];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(555));
	}

}
