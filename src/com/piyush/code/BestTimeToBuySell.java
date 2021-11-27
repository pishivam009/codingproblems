package com.piyush.code;

public class BestTimeToBuySell {

	public static int way1(int[] a) {
		int max = 0;

		for (int i = 0; i < a.length - 1; i++) {
			int buy = a[i];
			for (int j = i + 1; j < a.length; j++) {
				int sell = a[j];

				if (sell - buy > max)
					max = sell - buy;
			}
		}

		return max;
	}

//	public static int way2(int[] a) { // walley,peak approach --> not correct
//		int max = 0;
//
//		for (int i = 1; i < a.length; i++)
//			if (a[i] > a[i - 1])
//				max += a[i] - a[i - 1];
//
//		return max;
//	}
	
	public static int way3(int[] a) {//valley peak approach //
		int minprice= Integer.MAX_VALUE;
		int maxprofit=0;
		for(int i=0; i<a.length;i++) {// is it a valley
			if(a[i]<minprice)
			{
				minprice=a[i];
			}
			else if(a[i]-minprice>maxprofit) { // if it not valley, find the diff from valley
				maxprofit=a[i]-minprice;
			}
		}
		return maxprofit;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(way3(new int[] { 7, 1, 5, 3, 6, 4 }));
		System.out.println(way3(new int[] { 7, 6, 4, 3, 1 }));

	}

}
