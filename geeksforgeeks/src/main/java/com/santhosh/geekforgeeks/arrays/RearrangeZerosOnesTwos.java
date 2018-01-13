/**
 * 
 */
package com.santhosh.geekforgeeks.arrays;

import java.util.Scanner;

/**
 * @author santhosh
 *
 */
public class RearrangeZerosOnesTwos {

	public int[] rearrangeArray(int[] input) {
		int lo=0;
		int i=0;
		int high=input.length-1;
		while(i<=high) {
			switch(input[i]) {
			case 0:
				input[i]=input[lo];
				input[lo]=0;
				lo++;
				i++;
				break;
			case 1:
				i++;
				break;
			case 2 :
				input[i]=input[high];
				input[high]=2;
				--high;
				break;
				
			}
			
		}
		return input;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RearrangeZerosOnesTwos rearrange=new RearrangeZerosOnesTwos();
		Scanner scanner=new Scanner(System.in);
		int num_tc=scanner.nextInt();	
	for(int i=0;i<num_tc;i++) {
		int numElements=scanner.nextInt();
		int[] input=new int[numElements];
		for(int j=0;j<numElements;j++) {
			input[j]=scanner.nextInt();
		}
		input=rearrange.rearrangeArray(input);
		for(int k=0;k<input.length;k++) {
			System.out.print(input[k]);
		}
			System.out.println();
	}

	}

}
