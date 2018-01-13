/**
Given an array, reverse every sub-array formed by consecutive k elements.

Input:

The first line of input contains a single integer T denoting the number of test cases. Then T test cases follow. Each test case consist of two lines. The first line of each test case consists of an integer N, where N is the size of array.The second line of each test case contains N space separated integers denoting array elements.The third line of each test case consists of an integer K.

Output:
Corresponding to each test case, in a new line, print the modified array.

Constraints:

1 ≤ T ≤ 100
1 ≤ N ≤ 500
1 ≤ A[i] ≤ 500

Example:

Input
1
5
1 2 3 4 5
3

Output
3 2 1 5 4
 * 
 */
package com.santhosh.geekforgeeks.arrays;

import java.util.Scanner;

/**
 * @author santhosh
 *
 */
public class ReverseArrays {

	public void reverseArray(int[] arr,int key) {
		int loPointer=0;
		for(int  highPointer=0;highPointer<arr.length; highPointer++) {
			if(highPointer!=0 && highPointer%key==0) {
				reverseElements(arr,loPointer, highPointer-1);
				loPointer=highPointer;
			}
			
		}
		reverseElements(arr, loPointer, arr.length-1);
		
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		System.out.println();
	}
	
	public void reverseElements(int arr[],int low,int high) {
		while(high>low) {
			int tmp=arr[low];
			arr[low]=arr[high];
			arr[high]=tmp;
			--high;
			++low;
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReverseArrays ra=new ReverseArrays();
		Scanner scanner=new Scanner(System.in);
		int num_tc=scanner.nextInt();	
		for(int i=0;i<num_tc;i++) {
		int numElements=scanner.nextInt();
		int[] input=new int[numElements];
		for(int j=0;j<numElements;j++) {
			input[j]=scanner.nextInt();
		}
		int key=scanner.nextInt();
		ra.reverseArray(input, key);
		
			
	}

	}

}
