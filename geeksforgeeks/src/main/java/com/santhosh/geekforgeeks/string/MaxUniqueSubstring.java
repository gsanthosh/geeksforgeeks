package com.santhosh.geekforgeeks.string;

import java.util.Scanner;

public class MaxUniqueSubstring {
	public void maxUniqueSubstring(String inputString) {
	  
	  int maxLength=0;
	  inputString=inputString.toLowerCase();
	  for(int i=0;i<inputString.length();i++) {
		  int currentLength=0;
		  int[] charCnt=new int[26];
		  for(int j=i;j<inputString.length();j++) {
			  int charIndex=inputString.charAt(j)-'a';
			  charCnt[charIndex]++;
			  if(charCnt[charIndex]>1) {
				  break;
			  }
			  ++currentLength;
			  if(maxLength<currentLength) {
				  maxLength=currentLength;
			  }
		  }
	  }
	  System.out.println(maxLength);
	}
	public static void main(String[] args) {
		MaxUniqueSubstring mus=new MaxUniqueSubstring();
		Scanner scanner = new Scanner(System.in);
		int numTc=scanner.nextInt();
		for(int i=0;i<numTc;i++) {
			mus.maxUniqueSubstring(scanner.next());
		}
		

	}

}
