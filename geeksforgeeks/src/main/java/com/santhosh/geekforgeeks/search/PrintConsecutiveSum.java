package com.santhosh.geekforgeeks.search;

public class PrintConsecutiveSum {
	
	public static void printConsecutiveSum(int start,int end,int desiredSum) {
	    
		for(int i=start,sum=i,j=i+1;i<end;) {
			for(;sum<desiredSum && j<end+1;j++) {
				sum=sum+j;
				if(sum==desiredSum) {
					for(int k=i;k<=j;k++) {
						System.out.print(k+" ");		
					}
					System.out.println();
					break;
				}
			}
			sum=sum-i;
			i++;
			if(sum==desiredSum) {
				for(int k=i;k<=j-1;k++) {
					System.out.print(k+" ");		
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		PrintConsecutiveSum.printConsecutiveSum(0,63, 125);
	}

}
