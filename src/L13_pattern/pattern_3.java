package L13_pattern;

public class pattern_3 {
    static void main() {
        int num = 4;
        pattern(num);
    }
    static void pattern(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print("   *");
            }
            System.out.println("");
        }
    }
}
