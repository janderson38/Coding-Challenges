package com.revature;

import java.util.Arrays;

public class ReorderDigits {

	public static void main(String[] args) {
		int[] arr = {515, 341, 98, 44, 211};
		String order = "asc";
		
		
		
		System.out.println(Arrays.toString(reorderDigits(arr, order)));

	}
	
	static int[] reorderDigits(int[] arr, String order) {
		for(int i = 0; i < arr.length; i++) {
			char[] charArray = ("" + arr[i]).toCharArray();
			if(order == "asc") {
				Arrays.sort(charArray);
			}else if(order == "desc") {
				Arrays.sort(charArray);
				for(int j = 0; j < (charArray.length/2); j++) {
					char l = charArray[j];
					charArray[j] =charArray[charArray.length-j-1];
					charArray[charArray.length-j-1] = l;
				}
			}

			arr[i] = Integer.parseInt(new String(charArray));
		}
		
		return arr;
	}

}
