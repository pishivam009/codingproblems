package com.piyush.code;

import java.util.Stack;

public class ParenthesisChecker {

	
	public static boolean way1(String a) {
		Stack<Character> s= new Stack<Character>();
		for(char x: a.toCharArray()) {
			if(s.isEmpty()) {
				if((x=='}')||(x==']')||(x==')')) return false;
				else s.push(x);
			}else {
				if((s.peek()=='{')&&(x=='}')) s.pop();
				else if((s.peek()=='[')&&(x==']')) s.pop();
				else if((s.peek()=='(')&&(x==')')) s.pop();
				else s.push(x);
			}
		}
		return s.isEmpty();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(way1("{([])}"));
		System.out.println(way1("[()]{}{[()()]()}"));
	}

}
