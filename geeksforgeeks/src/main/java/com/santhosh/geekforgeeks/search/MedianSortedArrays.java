/**
 * 
 */
package com.santhosh.geekforgeeks.search;

/**
 * @author santhosh
 *
 */
public class MedianSortedArrays {

	public static int medianSortedArrays(int[] arr1,int[] arr2) {
		int[] arrMerged=new int[arr1.length+arr2.length];
		int totalLength=arr1.length+arr2.length;
		int arr1Pointer=0;
		int arr2Pointer=0;
		for(int i=0;i<totalLength;i++) {
			if(arr1Pointer < arr1.length && arr2Pointer<arr2.length) {
				if(arr1[arr1Pointer]<arr2[arr2Pointer]) {
					arrMerged[i]=arr1[arr1Pointer];
					arr1Pointer++;
				} else {
					arrMerged[i]=arr2[arr2Pointer];
					arr2Pointer++;
				}
			}
			else if (arr1Pointer < arr1.length) {
				while(arr1Pointer < arr1.length) {
					arrMerged[i]=arr1[arr1Pointer];
					arr1Pointer++;
					i++;
				}
			} 
			else if(arr2Pointer < arr2.length) {
				while(arr2Pointer < arr2.length) {
					arrMerged[i]=arr2[arr2Pointer];
					arr2Pointer++;
					i++;
				}
			}
		}
		int length=arrMerged.length;
		if(length%2!=0) {
			
			int lower=(int) Math.floor((length-1)/2);
			return arrMerged[lower];
		} else {
			int lower=(int) Math.floor((length-1)/2);
			return ((arrMerged[lower] +arrMerged[lower+1]) /2);
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {6,7,8,9,10};
		int num=11;
		System.out.println(num/2);
		System.out.println(MedianSortedArrays.medianSortedArrays(arr1, arr2));
		
	}

}
