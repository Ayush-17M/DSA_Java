package Arrays;

import java.util.HashSet;

public class Q36_Max_Erasure_value_1695 {

    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        int left = 0;

        int currentSum = 0;

        for(int i = 0; i < nums.length; i++){

            while(set.contains(nums[i])){
                set.remove(nums[left]);

                currentSum -= nums[left++];
            }

            set.add(nums[i]);
            currentSum += nums[i];

            ans = Math.max(ans, currentSum);
        }

        return ans;
    }
}
