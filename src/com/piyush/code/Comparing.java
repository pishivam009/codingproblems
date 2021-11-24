package com.piyush.code;

import java.util.Comparator;

public class Comparing {

	class Com implements Comparable<Com> { //this class knows how to get itself compared to other class

		@Override
		public int compareTo(Com o) {
			// TODO Auto-generated method stub
			return 0;
		}

	}
	
	class Com2 implements Comparator<Com2>{ //this class know how to compare two objects of a class

		@Override
		public int compare(Com2 o1, Com2 o2) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
