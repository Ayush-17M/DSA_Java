package L24_pattern;

public class pattern_2 {
    static void main() {
        int nums = 5;
        pattern(nums);
    }
    static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n ; j++) {
                System.out.print("   *");
            }
            System.out.println("");
        }
    }
}
