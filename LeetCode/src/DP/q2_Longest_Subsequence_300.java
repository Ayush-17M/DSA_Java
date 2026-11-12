package DP;

public class q2_Longest_Subsequence_300 {
     public int lengthOfLIS(int[] nums) {
         int n = nums.length;
         int[] result = new int[n]; // storing the subsequence frequency.

         for(int i = nums.length-1; i >= 0; i--){ // n-1 to 0

             int count = 1;
             for(int j = i+1; j < nums.length; j++){ // i+1 to n
                 if(nums[i] < nums[j]){
                       // Take the maximum length.
                     count = Math.max(count, 1 + result[j]);
                 }
             }
             // Store length starting from index i.
             result[i] = count;
         }

         int maxVal = 0;
         for(int num: result) {
             maxVal = Math.max(maxVal, num);
         }

         return maxVal;
     }
}
