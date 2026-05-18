package Question;
import java.util.Scanner;

public class Q31_minNum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find the minimum of two number..");
        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int num2 = sc.nextInt();
        System.out.println("minimum number: " + minNum(num1,num2));
    }
    static int minNum(int num1, int num2){
        int output = num1 < num2 ? num1 : num2;
        return output;
    }
}
