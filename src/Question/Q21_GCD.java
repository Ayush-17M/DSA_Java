package Question;
import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;

public class Q21_GCD {
    static void main() {
//    Write a program to find the Greatest Common Divisor(GCD) of two integer.
        System.out.println("Find the GCD of two number?");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();
        System.out.printf("GDV of %d and %d = %d",num1,num2,GCD(num1,num2));
    }

    static int GCD(int first,int second){
        int gcd = 1;
        for(int i=1; i<=first; i++){
            if(first%i == 0 && second%i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
}
