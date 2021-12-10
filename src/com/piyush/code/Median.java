package com.piyush.code;

import java.util.Arrays;

public class Median {

	public static int find_median(int[] v)
    {
        Arrays.sort(v);
        int n=v.length;
        int mid=v.length/2;
        if (n%2!=0)
        return v[mid];
        else
        return (v[mid]+v[mid-1])/2;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
