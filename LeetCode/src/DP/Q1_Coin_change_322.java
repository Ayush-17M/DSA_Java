package DP;

public class Q1_Coin_change_322 {
    public int coinChange(int[] coins, int amount) { // let coins=[1,5,6,9] amo = 11

        if(amount <= 0) {
            return 0;
        }
        int[] minCoinsDp = new int[amount+1];
        minCoinsDp[0] = 0;

        for(int i = 1; i <= amount; i++){
            minCoinsDp[i] = Integer.MAX_VALUE;// first assign max value in array

            for(int coin: coins){

                if(coin <= i && minCoinsDp[i-coin] != Integer.MAX_VALUE){
                    // important part
                    minCoinsDp[i] = Math.min(minCoinsDp[i], 1 + minCoinsDp[i-coin]);
                }
            }
        }

        return minCoinsDp[amount] == Integer.MAX_VALUE ? -1 : minCoinsDp[amount];
    }
}
