package DP;

public class Q4_Equal_Subset_Sum_416 {
    public boolean canPartition(int[] nums) {
        int totle = 0;
        for(int i = 0; i < nums.length; i++) {
            totle += nums[i];
        }

        if(totle % 2 != 0){
            return false;
        }
        int target = totle / 2;

        boolean[] dp = new boolean[target+1];
        dp[0] = true;

        for(int num: nums) {
            for(int j = target; j >= num; j--) {
                dp[j] = dp[j] || dp[j-num];
            }
        }

        return dp[target];
    }
}
