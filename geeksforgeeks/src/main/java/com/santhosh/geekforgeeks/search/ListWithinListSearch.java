/**
 * 
 */
package com.santhosh.geekforgeeks.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author santhosh
 *
 */
public class ListWithinListSearch {

	public static boolean listWithinList(List<Integer> listOne,List<Integer> listTwo) {
		int listOneSize=listOne.size();
		int listTwoSize=listTwo.size();
		if(listTwoSize> listOneSize) {
			return false;
		}
		int secondListPostion=0;
		for(int i=0;i<listOneSize;i++) {
			if(secondListPostion==listTwoSize) {
				return true;
			}
			if(listOne.get(i).equals(listTwo.get(secondListPostion))) {
				secondListPostion++;
			}else {
				secondListPostion=0;
			}
		}
		if(secondListPostion==listTwoSize) {
			return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		List<Integer> listOne= Arrays.asList(new Integer[] {1,2,3,4,5,6});
		List<Integer> secondOne= Arrays.asList(new Integer[] {5,6});
		System.out.println(ListWithinListSearch.listWithinList(listOne, secondOne));
		//System.out.println(ListWithinListSearch.listWithinList(secondOne, listOne));
	}
}
