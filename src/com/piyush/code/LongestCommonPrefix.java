package com.piyush.code;

public class LongestCommonPrefix {

	
	public static void way1(String[] a) {
		String prefix = a[0];
		int max=0;
		for(int i=1;i<=prefix.length();i++) {
			String test= prefix.substring(0, i);
			
			for(int j=1;j<a.length;j++) {
				int c=1;
				int val = a[j].indexOf(test);
				if (val!=0) break; else c++;
				
				if(c==a.length) max=Math.max(max, i);
			}
		}
		System.out.println(prefix.substring(0, max));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"flower","flow","flight"};
		way1(s);
	}

}
