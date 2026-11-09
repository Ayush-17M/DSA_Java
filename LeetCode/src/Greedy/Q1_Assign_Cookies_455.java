package Greedy;
import java.util.Arrays;

public class Q1_Assign_Cookies_455 {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;
        int count = 0;

        while( (i < g.length) && (j < s.length) ){
            // greed factor <= cookie factor, next child
            if(s[j] >= g[i]){
                i++;
            }

            // next cookie
            j++;
        }

        return i;
    }

}
