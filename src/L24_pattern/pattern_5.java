package L24_pattern;

public class pattern_5 {
    static void main() {
        int num = 5;
        pattern(num);
    }
    static void pattern(int n){
        for (int row = 0; row <= 2*n; row++) {
            int totalColsInRow = row > n ? 2 * n - row - 1 : row;
            for (int col = 1; col <= totalColsInRow ; col++) {
                System.out.print("  *");
            }
            System.out.println("");
        }
    }
}
