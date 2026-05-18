package if_else;
import java.util.Scanner;

public class Q2_divisible_by_5 {
    static void main() {
        System.out.println("Take positive integer input and tell if it is divisible by 5 of not!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the positive number: ");
        int num = input.nextInt();
        if(num%5 == 0){
            System.out.printf("%d is divisible by 5.",num);
        }
        else{
            System.out.printf("%d is not divisible by  5.",num);
        }
    }
}
