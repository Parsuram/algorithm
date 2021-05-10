
package com.algo.array;

import java.util.HashSet;
import java.util.Set;

public class ThreeSum {
	public int[] getThreeSum(int[] array, int targetSum) {
		int[] result = null;
		for(int i=0; i < array.length-2; i++) {
			int newTargetSum = targetSum - array[i];
			Set<Integer> nums = new HashSet<Integer>();
			for(int j=i+1; j < array.length;j++) {
				if(nums.contains(newTargetSum-array[j])) {
					result = new int[] {array[i],newTargetSum-array[j],array[j]};
				}
				nums.add(array[j]);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] array = {20, 303, 3, 4, 25};
		int targetSum = 49;
		ThreeSum sum = new ThreeSum();
		int[] result = sum.getThreeSum(array, targetSum);
		for (int i : result) {
			System.out.print(i +"\t");
		}
		System.out.println();
		
	}
}
