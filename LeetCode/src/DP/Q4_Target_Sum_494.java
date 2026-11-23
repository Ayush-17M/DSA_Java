package DP;

public class Q4_Target_Sum_494 {

    // nums = [1,1,1,1,1]; target = 3
    public int findTargetSumWays(int[] nums, int target) {

        int totle = 0; // totle = 5;
        for(int num: nums) {
            totle += num;
        }

        if(Math.abs(target) > totle || (totle + target) % 2 != 0){
            return 0;
        }
// array are divide into 2 group. 1 posSum, 2 nevSum;
// posSum - nevSum = target.  posSum + nevSum = totle

        int posSum = (totle + target) / 2; // posSum = (5+3)/2 = 4

        int[] dp = new int[posSum + 1];
        dp[0] = 1; // dp = [1,0,0,0,0]; -> size = 4+1; initial

        for(int num: nums) {
            for(int j = posSum; j >= num; j--) {
                dp[j] = dp[j] + dp[j-num];
            }
        }
// Loop:
        // dp = [1,1,0,0,0]; -> 1
        // dp = [1,2,1,0,0]; -> 2
        // dp = [1,3,3,1,0]; -> 3
        // dp = [1,4,6,4,1]; -> 4
        // dp = [1,5,10,10,5]; -> 5

        return dp[posSum];

    }
}
