package org.programing.datastructure;

public class MaxSubArray {
	public static int maxSubArray(int[] nums) {

		int sum = 0;
		int flag = 0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] < 0 )
				flag = 1;

			sum = sum + nums[i];
		}
		System.out.println("sum" + sum);

		if(flag == 0)
			return sum;
		else
			return  returnSum(nums, 0, nums.length-1, sum);

	}


	private static int returnSum(int[] nums, int first, int last,  int sum){
		if(first==last)
			return nums[first];
		else{

			int max1 = returnSum(nums, first, last-1, sum-nums[last]);
			int max2 = returnSum(nums, first+1, last, sum-nums[first]);

			if(max1 > max2){
				System.out.println("max1-->"+max1+ " sum-->"+ sum);
				System.out.println("first "+ first+" last " +(last-1));
				return max1 > sum ? max1 : sum;
				
		    	}
				else{
				System.out.println("max2-->"+max1+ " sum-->"+ sum);
				System.out.println("first "+ (first+1)+" last " +(last));
				return max2 > sum ? max2 : sum;
				}
		}
	}

	public static void main(String[] args) {
		int[] arr = {-84,-87,-78,-16,-94,-36,-87,-93,-50,-22,-63,-28,-91,-60,-64,-27,-41,-27,-73,-37,-12,-69,-68,-30,-83,-31,-63,-24,-68,-36,-30,-3,-23,-59,-70,-68,-94,-57,-12,-43,-30,-74,-22,-20,-85,-38,-99,-25,-16,-71,-14,-27,-92,-81,-57,-74,-63,-71,-97,-82,-6,-26,-85,-28,-37,-6,-47,-30,-14,-58,-25,-96,-83,-46,-15,-68,-35,-65,-44,-51,-88,-9,-77,-79,-89,-85,-4,-52,-55,-100,-33,-61,-77,-69,-40,-13,-27,-87,-95,-40};
		System.out.println(maxSubArray(arr));
	}
}
