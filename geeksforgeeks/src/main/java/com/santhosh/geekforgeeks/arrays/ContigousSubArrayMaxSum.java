package com.santhosh.geekforgeeks.arrays;

import java.util.Scanner;

/**
 * Follow Kadane's algorithm
 * Given an array containing both negative and positive integers. Find the contiguous sub-array with maximum sum.
 
Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows. The first line of each test case contains a single integer N denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.
 
Output:
Print the maximum sum of the contiguous sub-array in a separate line for each test case.
 
Constraints:
1 ≤ T ≤ 200
1 ≤ N ≤ 1000
-100 ≤ A[i] <= 100
 
Example:
Input
2
3
1 2 3
4
-1 -2 -3 -4
Output
6
-1
*
*/
public class ContigousSubArrayMaxSum {
	
	public int findMaxSum(int[] input) {
		//Use two loops to get every sum
		int globalMaxSum=input[0];
		int currentMaxSum=input[0];
		for(int i=1;i<input.length;i++) {
			currentMaxSum=((currentMaxSum+input[i])>=input[i])?currentMaxSum+input[i]:input[i];
			globalMaxSum=((globalMaxSum>=currentMaxSum)?globalMaxSum:currentMaxSum);
		}
		
		return globalMaxSum;
	}

	public static void main(String[] args) {
		ContigousSubArrayMaxSum maxSum=new ContigousSubArrayMaxSum();
		Scanner scanner=new Scanner(System.in);
		int num_tc=scanner.nextInt();	
	for(int i=0;i<num_tc;i++) {
		int numElements=scanner.nextInt();
		int[] input=new int[numElements];
		for(int j=0;j<numElements;j++) {
			input[j]=scanner.nextInt();
		}
		System.out.println(maxSum.findMaxSum(input));
			
	}
}
}
