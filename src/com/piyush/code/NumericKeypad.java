package com.piyush.code;

	

public class NumericKeypad {
	
	public static void way1(String a) {
		String str[] = {"2","22","222",
                "3","33","333",
                "4","44","444",
                "5","55","555",
                "6","66","666",
                "7","77","777","7777",
                "8","88","888",
                "9","99","999","9999"
            };
		
		for(char k: a.toLowerCase().toCharArray()) {
			System.out.print(str[k-'a']);
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		way1("GEEKSFORGEEKS");
	}
}
