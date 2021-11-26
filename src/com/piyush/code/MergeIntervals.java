package com.piyush.code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

class Interval {
	int start, end;

	public Interval(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+this.start+","+this.end+"]";
	}
}

public class MergeIntervals {

	public static void way1(Interval[] a) {
		
		if (a.length <= 0)
            return;

		Arrays.sort(a, new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				// TODO Auto-generated method stub
				return o1.start - o2.start; // ascending
			}
		});
		Stack<Interval> s = new Stack<Interval>();
		s.push(a[0]);
		for (int i = 1; i < a.length; i++) {
			Interval top = s.peek();

			if (top.end < a[i].start) // no overlap
			{
				s.push(a[i]);
			} else if (top.end <= a[i].end){ // can be top.end = a[i].end also, makes no difference
 				top.end = a[i].end;
				s.pop();
				s.push(top); // commit changes from top variable to actual stack
			}
		}
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interval arr[]=new Interval[4];
        arr[0]=new Interval(6,8);
        arr[1]=new Interval(1,9);
        arr[2]=new Interval(2,4);
        arr[3]=new Interval(4,7);
        way1(arr);
	}

}
