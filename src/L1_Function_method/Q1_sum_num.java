package L1_Function_method;
import java.util.Scanner;

public class Q1_sum_num {
    static void main(String[] args) {
//        Function
//        function call
        sum();
        int ans = sum();
        System.out.println("Using 'return' Answer: "+ans);
    }
//    function definition
    static int sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Finding the sum of two number.");
        int num1,num2,sum;
        System.out.print("Enter the 1st number: ");
        num1 = input.nextInt();
        System.out.print("Enter the 2nd number: ");
        num2 = input.nextInt();
        sum = num1 + num2;
        System.out.println("The sum = "+ sum);
        return sum;
    }
}
