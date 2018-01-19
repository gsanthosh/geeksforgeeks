/**
 * 
 */
package com.santhosh.geekforgeeks.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author santhosh
 *
 */
public class LongestSubstringPalindrome {
	
	public List<String> generateSubstring(String input){
		List<String> stringList=new ArrayList<String>();
		for(int i=0;i<input.length();i++) {
			for(int j=i+1;j<=input.length();j++) {
				stringList.add(input.substring(i,j));
			}
		}
		return stringList;
	}
	
	public boolean checkPalindrome(String input) {
		if(input.length()==1) {
			return true;
		}
		int low=0;
		int high=input.length()-1;
		char[] charArray=input.toCharArray();
		while(high>low) {
			if(charArray[low]!=charArray[high]) {
				return false;
			}
			high--;
			low++;
		}
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestSubstringPalindrome lsp=new LongestSubstringPalindrome();
		List<String> subsStringList=(lsp.generateSubstring("abba"));
		for(String s:subsStringList) {
			if(lsp.checkPalindrome(s)) {
				System.out.println(s);
			}
		}
		
	}

}
