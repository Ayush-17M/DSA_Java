package Question;
import java.util.Scanner;

public class Q3_factorial {
    public static int factorial(int fact){
        if(fact==0 || fact==1){
            return 1;
        }
        else{
            return fact * factorial(fact-1);
        }
    }
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Finding the factorial of any number.");
        System.out.print("Enter the any number: ");
        int num = input.nextInt();
        System.out.printf("Factorial of %d is: %d",num,factorial(num));

    }
}
