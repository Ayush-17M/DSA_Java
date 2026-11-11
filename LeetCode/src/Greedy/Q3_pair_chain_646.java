package Greedy;
import java.util.Arrays;

public class Q3_pair_chain_646 {

    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));
        int count = 0;
        int end = Integer.MIN_VALUE;

        for(int i = 0; i < pairs.length; i++) {
            if(pairs[i][0] > end){ // next left > previous right
                count++;
                end = pairs[i][1]; // previous right;
            }
        }
        return count;

    }
}
