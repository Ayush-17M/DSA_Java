package DP;
import java.util.Arrays;

public class Q3_jJpb_Scheduling_1235 {

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[][] jobs = new int[n][3]; // 3 -> ST, ET, Profit;

        for(int i = 0; i < n; i++){
            jobs[i][0] = startTime[i]; // At 0 -> starttime of job
            jobs[i][1] = endTime[i]; // At 1 -> endTime of job
            jobs[i][2] = profit[i]; // At 2 -> profit of job
        }

        Arrays.sort(jobs, (a,b) -> Integer.compare(a[0],b[0]));

        int[] dp = new int[n + 1]; // dp store the max profit of job.
        for(int i = n - 1; i >= 0; i--) {

            int nextJob = searchNextJob(jobs, i+1, jobs[i][1]); // get the next job index
            int take = jobs[i][2] + dp[nextJob];
            int notTake = dp[i + 1];

            dp[i] = Math.max(take, notTake); // max profit
        }

        return dp[0];
    }

    private int searchNextJob(int[][] jobs,int l, int end){ // l -> index of next job, end -> previous job endTime
        int r = jobs.length - 1; // no of job

        int result = jobs.length; // store the next job index;

        // find the index of next job which have startTime >= previous job endTime
        while(l <= r){
            int mid = l + (r - l) / 2;

            if(jobs[mid][0] >= end) {
                result = mid;
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }

        return result;
    }

}
