/**
 * 
 */
package com.santhosh.geekforgeeks.string;

import java.util.Scanner;

/**
 * @author santhosh
 *
 */
public class StringPermutation {
	
	public void generatePermutation(String input) {
	
		if(input.length()==1) {
			System.out.println(input);
			return;
		}
		for (int i=0;i<input.length();i++) {
			generatePermutation(String.valueOf(input.charAt(0)),input.substring(1, input.length()));
			input=rotate(input);
		}
	}
	
	

	private void generatePermutation(String fixed, String substring) {
		// TODO Auto-generated method stub
		if(substring.length()==1) {
			System.out.println(fixed+substring);
			return;
		}
		for(int i=0;i<substring.length();i++) {
		generatePermutation(fixed+String.valueOf(substring.charAt(0)), substring.substring(1, substring.length()));
		substring=rotate(substring);
		}
	}



	public String rotate(String input) {
	     if(input.length()==1)
	    	 	return input;
	     return input.substring(1,input.length())+input.charAt(0);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPermutation sp=new StringPermutation();
		Scanner scanner = new Scanner(System.in);
		int numTc=scanner.nextInt();
		for(int i=0;i<numTc;i++) {
			sp.generatePermutation(scanner.next());
		}
	
	}

}
