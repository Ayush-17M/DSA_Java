package Question;
import java.util.Scanner;

public class Q19_sumOfOdd_1_to_n {
    public static void main() {
//        Write a program to sum all odd numbers from 1 to a specified number n.
        System.out.println("sum all odd numbers..");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n number: ");
        int n = sc.nextInt();
        System.out.printf("Sum of odd num 1 to %d: %d",n,sumOddNum(n));
    }
     static int sumOddNum(int num){
        int sum=0;
        for(int i=0;i<num+1;i++){
            if(i%2 != 0){
                sum += i;
            }
        }
        return sum;
    }
}
