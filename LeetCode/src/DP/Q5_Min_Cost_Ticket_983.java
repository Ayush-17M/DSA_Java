package DP;
import java.util.Arrays;

public class Q5_Min_Cost_Ticket_983 {

    int[] dp;
    public int mincostTickets(int[] days, int[] costs) {
        dp = new int[days.length];
        Arrays.fill(dp, -1);

        return solve(days, costs, 0);
    }

    private int solve(int[] days, int[] costs, int i){
        if(i >= days.length) {
            return 0;
        }

        if(dp[i] != -1) {
            return dp[i];
        }

        //  1 Day pass
        int cost_1 = costs[0] + solve(days, costs, i+1);

        // 7 Day pass
        int max_Day = days[i] + 7;
        int j = i;

        while(j < days.length && days[j] < max_Day) {
            j++;
        }

        int cost_2 = costs[1] + solve(days, costs, j);

        // 30 Day pass

        max_Day = days[i] + 30;
        j = i;

        while(j < days.length && days[j] < max_Day) {
            j++;
        }

        int cost_3 = costs[2] + solve(days,costs, j);

        return dp[i] = Math.min(cost_1, Math.min(cost_2, cost_3));
    }

}
