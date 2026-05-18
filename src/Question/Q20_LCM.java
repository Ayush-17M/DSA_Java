package Question;
import java.util.Scanner;

public class Q20_LCM {
    public static void main(String[] args){
//        Write a program to find the Least Common Multiple (LCM) of two numbers.
        System.out.println("Finding the LCM of two number?");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();
        System.out.printf("LCM of %d and %d = %d",num1,num2,lcm(num1,num2));
    }
    static int lcm(int first,int second){
        int i = 1;
        while(true){
            int factor = first * i;
            if(factor % second == 0){
                return factor;
            }
            i++;
        }
    }
}
