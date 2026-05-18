package if_else;
import java.util.Scanner;

public class Q1_odd_or_even {
    static void main() {
        System.out.println("Take positive integer input and tell if it is odd or even:");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the positive integer: ");
        int P_num = input.nextInt();
        if(P_num > 0){
            if(P_num % 2 == 0){
                System.out.printf("%d is Even number.",P_num);
            }
            else{
                System.out.printf("%d is Odd number.",P_num);
            }
        }
        else{
            System.out.println("Your input number is less than 1. Tyr again!");
        }
    }
}
