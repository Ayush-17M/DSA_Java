package L24_pattern;
import java.util.Scanner;

public class pattern_1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int nums = sc.nextInt();
        patter(nums);
    }
    static void patter(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("   *");
            }
            System.out.println("");
        }
    }
}
