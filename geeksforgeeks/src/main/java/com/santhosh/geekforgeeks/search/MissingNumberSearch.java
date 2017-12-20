/**
 * 
 */
package com.santhosh.geekforgeeks.search;

/**
 * @author santhosh
 *
 */
public class MissingNumberSearch {
	
	public static void missingNumberSearch(int[] arr) {
		int length=arr.length;
		int expectedSum=(length*(length+1))/2;
		int sum=0;
		for(int i=0;i<length;i++) {
			sum=sum+arr[i];
		}
	   System.out.println(arr[length-1]-(sum-expectedSum));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		MissingNumberSearch.missingNumberSearch(arr);
	}

}
