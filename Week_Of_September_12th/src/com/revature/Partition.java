package com.revature;

public class Partition {

	public static void main(String[] args) {
		int[] arr = {-2,-8,4,1};
		
		System.out.println(canPartition(arr));

	}
	
	static boolean canPartition(int[] arr) {
		int maxAbs= -1;
		int maxAbsPosition = -1;
		for(int i = 0; i < arr.length; i++) {
			if(Math.abs(arr[i]) > Math.abs(maxAbs)) {
				maxAbs = arr[i];
				maxAbsPosition = i;
			}
		}
		int product = 1;
		for(int j = 0; j < arr.length; j++) {
			if(j != maxAbsPosition) {
				product *= arr[j];
				
			}
		}
		System.out.println(product);
		System.out.println(maxAbs);
		return product == maxAbs;
		
	}

}
