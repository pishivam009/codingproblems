package com.piyush.code;

import java.util.Stack;

public class MinRevsForBalance {

	public static int way1(String a) {

		if (a.length() % 2 == 1)
			return -1;

		Stack<Character> s = new Stack<Character>();
		for (char c : a.toCharArray()) {
			if (c == '}' && !s.isEmpty()) {
				if (s.peek() == '{')
					s.pop();
				else
					s.push(c);
			} else
				s.push(c);
		}

		if (s.isEmpty())
			return 0;

		int open = 0, close = 0;

		while (!s.empty()) {
			if (s.peek() == '{')
				open++;
			else
				close++;
			s.pop();
		}
		int x = (int) Math.ceil((close + 0.0) / 2); // make it double. if it is int then 3/2 will give 1 inside the
													// bracket
		int y = (int) Math.ceil((open + 0.0) / 2);
		return x + y; // total reversals

	}

	public static int way2(String a) { // two pointers o(1) space
		if (a.length() % 2 == 1)
			return -1;
		int open = 0, close = 0;

		for (char c : a.toCharArray()) {

			if (c == '{')
				open++;

			else {
				if (open == 0) // open bracket doesn't exist, so add another unbalanced close bracket
					close++;
				else
					open--; // balance the bracket by closing it
			}
		}

		int x = (int) Math.ceil((close + 0.0) / 2); // make it double. if it is int then 3/2 will give 1 inside the
													// bracket
		int y = (int) Math.ceil((open + 0.0) / 2);
		return x + y; // total reversals

	}

	public static int way3(String a) { // one pointer
		if (a.length() % 2 == 1)
			return -1;
		int temp = 0, res = 0;

		for (char c : a.toCharArray()) {

			if (c == '{')
				temp++;

			else {
				if (temp == 0) // open bracket doesn't exist, so add another unbalanced close bracket
				{
					res++;
					temp++;
				} else
					temp--; // balance the bracket by closing it
			}
		}

		if (temp > 0)
			res += temp / 2;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(way3(new String("}{{}}{{{}}")));
	}

}
