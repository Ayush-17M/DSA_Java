package L3_Linear_Search;

public class maxWealth {
    public static void main(String[] args){
        int[][] arr={{1,2,4},{3,2,1}};
        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int[][] accounts){
        //person = row;,
        //account = col;
        int max = Integer.MIN_VALUE;
//        System.out.println(accounts.length);
        for(int person=0;person < accounts.length;person++){
            int sum = 0;
            for(int account=0;account < accounts[person].length;account++){
                sum += accounts[person][account];
            }
            if(max <= sum){
                max = sum;
            }
        }
        return max;
    }
}
