package Arrays;

public class Q37_Longest_Nice_Subarray_2401 {

    public int longestNiceSubarray(int[] nums) {
        int result = 1;

        int mask = 0;
        int left = 0;

        for(int right = 0; right < nums.length; right++) {

            while((nums[right] & mask) != 0){ // AND

                mask = mask ^ nums[left++]; // XOR -> keep shrinking
            }

            mask = mask | nums[right];  // OR
            result = Math.max(result, right - left + 1);
        }

        return result;
    }

}
