package com.piyush.code;

public class MiddleElement {

	public static int way1(int A, int B, int C) {
		if ((A >= B && A <= C) || (A >= C && A <= B))
			return A;
		else if ((B >= A && B <= C) || (B >= C && B <= A))
			return B;
		else
			if ((C >= A && C <= B) || (C >= B && C <= A)) return C;
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(way1(162,934,200));
	}

}
