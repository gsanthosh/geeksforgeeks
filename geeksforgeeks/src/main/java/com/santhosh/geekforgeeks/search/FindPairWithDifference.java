package com.santhosh.geekforgeeks.search;

/*
 * Given an unsorted array and a number n, find if there exists a pair of elements in the array whose difference is n.

Examples:
Input: arr[] = {5, 20, 3, 2, 50, 80}, n = 78
Output: Pair Found: (2, 80)

Input: arr[] = {90, 70, 20, 80, 50}, n = 45
Output: No Such Pair
 */
public class FindPairWithDifference {

	public static void findPairWithDifference(int arr[], int diff) {
		int length = arr.length;
		if (arr.length!=0 || arr.length != 1) {
			for (int i = 0; i < length - 1; i++) {
				for (int j = i + 1; j < length; j++) {
					if (Math.abs(arr[j] - arr[i]) == diff) {
						System.out.println("Number are i" + arr[i] + "  j  is" + arr[j]);
						return;
					}
				}
			}
		}
		System.out.println("No such pair found");
	}

	public static void main(String[] args) {
		//int arr[] = { 5, 20, 3, 2, 50, 80 };
		int arr[] = { 90,70,20,80,50};
		FindPairWithDifference.findPairWithDifference(arr, 45);
	}

}
