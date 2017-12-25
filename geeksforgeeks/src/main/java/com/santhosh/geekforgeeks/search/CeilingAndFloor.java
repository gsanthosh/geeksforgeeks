/*
Given a sorted array and a value x, the ceiling of x is the smallest element in array greater than or equal to x, and the floor is the greatest element smaller than or equal to x.
 Assume than the array is sorted in non-decreasing order. Write efficient functions to find floor and ceiling of x.

For example, let the input array be {1, 2, 8, 10, 10, 12, 19}
For x = 0:    floor doesn't exist in array,  ceil  = 1
For x = 1:    floor  = 1,  ceil  = 1
For x = 5:    floor  = 2,  ceil  = 8
For x = 20:   floor  = 19,  ceil doesn't exist in array
In below methods, we have implemented only ceiling search functions. Floor search can be implemented in the same way.
For example, let the input array be {1, 2, 8, 10, 10, 12, 19}
For x = 0:    floor doesn't exist in array,  ceil  = 1
For x = 1:    floor  = 1,  ceil  = 1
For x = 5:    floor  = 2,  ceil  = 8
For x = 20:   floor  = 19,  ceil doesn't exist in array
*/
package com.santhosh.geekforgeeks.search;

public class CeilingAndFloor {
	public void findCeilingAndFloor(int[] arr,int num) {
		int lo=0;
		int high=arr.length;
		int absMinimum=Integer.MAX_VALUE;
		int absMinimumIndex=-1;
		while(high >= lo) {
			int midPoint=(high+lo)/2;
			int diff=arr[midPoint]-num;
			if(diff==0) {
				System.out.println("The celing value is\t\t"+arr[midPoint]);
				System.out.println("The floor value is\t\t"+arr[midPoint]);
			}
			
			if(diff<0) {
				if(Math.abs(diff) <= absMinimum) {
					absMinimum=Math.abs(diff);
					absMinimumIndex=midPoint;
				}
				lo=midPoint+1;
			}
			else {
				high=midPoint-1;
			}
		}
		if(lo<=0 || high<=0) {
			if(absMinimumIndex==-1) {
				System.out.println("The floor value is\t\t"+absMinimumIndex);
				System.out.println("The ceiling value is \t\t"+arr[0]);
			} else {
				System.out.println("The floor value is\t\t"+absMinimumIndex);
				System.out.println("The ceiling value is \t\t"+arr[0]);
			}
			
		}
	}
	public static void main(String args[]) {
		
	}

}
