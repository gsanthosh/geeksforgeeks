package com.santhosh.geekforgeeks.search;

public class InterpolationSearch {

	public int interpolationSearch(int startIndex,int endIndex,int key,int[] arr) {
	
		if(arr[endIndex]<=arr[startIndex]) {
		throw new IllegalStateException();
	}
	while(startIndex<endIndex) {
		int pos=startIndex + (key*((endIndex-startIndex)+1)/(arr[endIndex]-arr[startIndex]));
		if(arr[pos]==key) {
			return pos;
		}
		if(arr[pos]>key) {
			endIndex=pos-1;
			continue;
		}
		
		if(arr[pos]<key) {
			startIndex=pos+1;
			continue;
		}
	}
		return -1;
	}
	
	public static void main(String[] args) {
		InterpolationSearch interpolationSearch=new InterpolationSearch();
		int arr[]= {1,2,3,4,5,6,7,8,9};
		System.out.println(interpolationSearch.interpolationSearch(0, 8,7, arr));
	}

}
