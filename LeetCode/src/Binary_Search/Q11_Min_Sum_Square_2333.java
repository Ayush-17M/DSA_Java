package Binary_Search;

public class Q11_Min_Sum_Square_2333 {

    private int[] diff;

    public long minSumSquareDiff(int[] nums1, int[] nums2,
                                 int k1, int k2) {

            int n = nums1.length;
            int[] diff = new int[n];

            long total = 0;
            int maxDiff = 0;

            // Calculate absolute differences
            for (int i = 0; i < n; i++) {
                diff[i] = Math.abs(nums1[i] - nums2[i]);
                total += diff[i];
                maxDiff = Math.max(maxDiff, diff[i]);
            }

            int k = k1 + k2;

            // All differences can become zero
            if (total <= k) {
                return 0;
            }

            // Binary search the maximum allowed difference
            int left = 0, right = maxDiff;

            while (left < right) {
                int mid = left + (right - left) / 2;
                long operations = 0;

                for (int d : diff) {
                    operations += Math.max(0, d - mid);
                }

                if (operations <= k) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }

            // Reduce every difference to at most left
            for (int i = 0; i < n; i++) {
                k -= Math.max(0, diff[i] - left);
                diff[i] = Math.min(diff[i], left);
            }

            // Use remaining operations to reduce equal differences
            for (int i = 0; i < n && k > 0; i++) {
                if (diff[i] == left) {
                    diff[i]--;
                    k--;
                }
            }

            // Calculate the sum of squares
            long ans = 0;

            for (int d : diff) {
                ans += (long) d * d;
            }

            return ans;
        }
    
}
