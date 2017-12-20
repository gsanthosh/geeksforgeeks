package com.santhosh.geekforgeeks.search;
/**
 * 
 */

/**
 * @author santhosh Class for performing Binary Search
 *
 */
public class BinarySearch {

	/**
	 * Returns index of key if found or -1
	 * 
	 * @param startIndex
	 * @param endIndex
	 * @param arr
	 * @return
	 */
	public int binarySearch(int startIndex, int endIndex, int[] arr, int key) {

		if (startIndex > endIndex) {
			return -1;
		}
		int midPoint = (startIndex + endIndex) / 2;
		if (arr[midPoint] == key) {
			return midPoint;
		}
		if (arr[midPoint] == key) {
			return midPoint;
		} else if (arr[midPoint] > key) {
			return binarySearch(startIndex, midPoint - 1, arr, key);
		} else {
			return binarySearch(midPoint + 1, endIndex, arr, key);
		}

	}
	
	public int binarySearchIterative(int startIndex, int endIndex, int[] arr, int key) {

		while (startIndex <= endIndex) {
			int midPoint = (startIndex + endIndex) / 2;
			if (arr[midPoint] == key) {
				return midPoint;
			} else if (arr[midPoint] > key) {
				endIndex=midPoint - 1;
			} else {
				startIndex=midPoint + 1;
			}	
		}	
		return -1;		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11 };
		System.out.println(bs.binarySearch(0, arr.length-1, arr, 1));
		System.out.println(bs.binarySearch(0, arr.length-1, arr, 10));
		System.out.println(bs.binarySearch(0, arr.length-1, arr, 5));
		System.out.println(bs.binarySearch(0, arr.length-1, arr, 3));
		System.out.println(bs.binarySearch(0, arr.length-1, arr, 7));
		System.out.println(bs.binarySearch(0, arr.length-1, arr, 46));
		
		
		System.out.println(bs.binarySearchIterative(0, arr.length-1, arr, 1));
		System.out.println(bs.binarySearchIterative(0, arr.length-1, arr, 10));
		System.out.println(bs.binarySearchIterative(0, arr.length-1, arr, 5));
		System.out.println(bs.binarySearchIterative(0, arr.length-1, arr, 3));
		System.out.println(bs.binarySearchIterative(0, arr.length-1, arr, 7));
		System.out.println(bs.binarySearchIterative(0, arr.length-1, arr, 46));

	}

}
