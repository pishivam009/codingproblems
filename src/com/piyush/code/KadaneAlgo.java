package com.piyush.code;

public class KadaneAlgo {
	public static int way1(int[]a) {
		int max_so_far=Integer.MIN_VALUE, max_ending_here=0;
		for(int k:a) {
			max_ending_here+=k;
		if(max_ending_here>max_so_far)max_ending_here=max_so_far;
		if(max_ending_here<0)max_ending_here=0;
			
		}
		return max_so_far;
	}
	
	public static int way2(int[]a) {
		int max_so_far=a[0], curr_max=a[0];
		
		for(int i=1;i<a.length;i++) {
//			max_so_far+=a[i];
//			
//			if(max_so_far>curr_max)curr_max=max_so_far;
			
			//curr_max=Math.max(a[i],curr_max+a[i]); --> can be rewritten as below
			if(curr_max+a[i]>a[i])curr_max+=a[i]; //if adding increases sum then add
			else curr_max=a[i];  //else start fresh from a[i]
			
			max_so_far=Math.max(curr_max,max_so_far); //is the current maximum greater than overall maximun till now?
		}
		
		return max_so_far;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
