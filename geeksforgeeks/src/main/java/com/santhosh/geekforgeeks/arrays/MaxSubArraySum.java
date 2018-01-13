/**
 * 
 */
package com.santhosh.geekforgeeks.arrays;

import java.util.Scanner;

/**
 * @author santhosh
 *
 */
public class MaxSubArraySum {

	public void printSubArraySum(int[] arr,int sum) {
	 if(arr==null) {
		 System.out.println(-1);
	 }
	 if(arr.length==1 && arr[0]==sum) {
		 System.out.println("SubArray index"+0+" and "+0);
	 }
	 int loPointer=0;
	 int highPointer=0;
	 int currentSum=0;
	 while(highPointer<arr.length) {
		 currentSum=currentSum+arr[highPointer];
		 if(currentSum==sum) {
			 System.out.println("SubArray index"+loPointer+" and "+highPointer);
			 return;
		 }
		 else if(currentSum < sum) {
			 highPointer++;
			 continue;
		 }
		 else {
			 while(currentSum>sum) {
				 currentSum=currentSum-arr[loPointer];
				 loPointer++;
				 if(currentSum==sum) {
					 System.out.println("SubArray index "+loPointer+" and "+highPointer);
					 return;
				 }
				 if(loPointer>=highPointer) {
					 highPointer=loPointer;
					 break;
				 }
			 }
			 highPointer++;
			 
		 }
	 }
	 System.out.println(-1);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MaxSubArraySum maxSunSumArray=new MaxSubArraySum();
		Scanner scanner=new Scanner(System.in);
		int num_tc=scanner.nextInt();	
	for(int i=0;i<num_tc;i++) {
		int numElements=scanner.nextInt();
		int expectedSum=scanner.nextInt();
		int[] input=new int[numElements];
		for(int j=0;j<numElements;j++) {
			input[j]=scanner.nextInt();
		}
		maxSunSumArray.printSubArraySum(input,expectedSum);
			
	}

	}

}
