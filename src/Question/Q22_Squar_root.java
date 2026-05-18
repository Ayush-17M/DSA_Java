package Question;
import java.util.Scanner;

public class Q22_Squar_root {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Finding the square root. ");
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
//        System.out.println(Math.sqrt(num));
        System.out.printf("Square root of %d : %.2f",num,squreRoot(num));
    }
    static double squreRoot(int num){
       return Math.sqrt(num);
    }
}
