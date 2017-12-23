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
	
	public static void missingNumberSearchRotatedArray(int arr[]) {
		System.out.println(findRotationPoint(arr,0,arr.length-1));
		
	}
	
	public static int findRotationPoint(int[] arr,int high,int lo) {
		int midPoint=-1;
		while(high>lo) {
			midPoint = (high +lo) / 2;
			if(high==lo) {
				return lo;
			}
			if(midPoint<high && arr[midPoint]>arr[midPoint+1]) {
				return midPoint;
			}
			if (midPoint > lo && arr[midPoint] < arr[midPoint - 1])
		           return (midPoint-1);
			if(arr[lo] >arr[midPoint]) {
				high=midPoint-1;
			}
			else lo=midPoint+1;
			}
		return midPoint;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int arr[] = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		//MissingNumberSearch.missingNumberSearch(arr);
		//int arr[] = {11,12, 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int arr[] = {11,12, 13,14, 10 };
		System.out.println(MissingNumberSearch.findRotationPoint(arr,arr.length-1,0));
	}

}
