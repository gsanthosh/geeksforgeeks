package com.santhosh.geekforgeeks.search;

public class PrintConsecutiveSum {
	
	public static void printConsecutiveSum(int start,int end,int desiredSum) {
		int sum=0;
		for(int i=start;i<end;i++) {
			sum=i;
			for(int j=i+1;sum<desiredSum;j++) {
				sum=sum+j;
				if(sum==desiredSum) {
					for(int k=i;k<=j;k++) {
						System.out.print(k+" ");	
						
					}
					System.out.println();
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		PrintConsecutiveSum.printConsecutiveSum(0,63, 125);
	}

}
