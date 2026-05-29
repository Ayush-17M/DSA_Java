package Stack_Queue;
import java.util.*;

public class GameOf_Two_Stack {
    static void main() {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();  // Enter 1
        for(int i = 0; i < t; i++){
            int n = s.nextInt(); // size of array a. 5
            int m = s.nextInt(); // size of array b. 4
            int x = s.nextInt(); // target value 10
            int[] a = new int[n];
            int[] b = new int[m];

            for(int j = 0; j < n; j++){
                a[j] = s.nextInt(); // 4 2 4 6 1
            }
            for(int j = 0; j < m; j++){
                b[j] = s.nextInt(); // 2 1 8 5
            }

            System.out.println(twoStacks(x, a, b)); // ans --> 4
        }
    }
    static int twoStacks(int x, int[] a, int[] b){
        return twoStacks(x, a, b, 0, 0) - 1;
    }
    static int twoStacks(int x, int[] a, int[] b, int sum, int count){
        // base condition
        if(sum > x) {
            return count;
        }

        if(a.length == 0 || b.length == 0){
            return count;
        }

        int ans1 = twoStacks(x, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);
        int ans2 = twoStacks(x, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count + 1);

        return Math.max(ans1, ans2);
    }
}
