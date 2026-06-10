package Arrays;

import java.util.*;

public class Q32_Max_SubArray_valueII_3691 {
    public long maxTotalValue(int[] nums, int k) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        return findMaxPossible(nums, k, new ArrayList(), 0, 0);

    }
    public long findMaxPossible(int[]nums, int k,ArrayList<Integer> list, long sum, int ind) {
       // base condition
        if (list.size() == k) {
            sum += (Collections.max(list) - Collections.min(list));
            return sum;
        }

        for (int i = ind; i < nums.length; i++) {
            list.add(nums[i]);
            sum = findMaxPossible(nums, k, list, sum, i + 1);

            list.remove(list.size() - 1);
        }
        return sum;
    }

    public void main() {
//        int[] nums = {1,3,2};
//        int k = 2;
        int[] nums = {4, 2, 5, 1};
        int k = 3;
        System.out.println(maxTotalValue(nums, k));
    }
}
