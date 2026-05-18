package Question;
import java.util.Scanner;

public class Q10_n_prime_num {
    static void prime(int num){
        boolean isprime = true;
        for(int i=2; i<=num;i++){
            for(int j=2;j<i;j++){
                if(i%j == 0){
                    isprime = false;
                    break;
                }
                else {
                    isprime = true;
                }
            }
            if(isprime){
                System.out.print(" "+i);
            }
        }
    }
    public static void main() {
        System.out.println("Finding the prime number between 1 to n.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n number: ");
        int num = input.nextInt();
        System.out.print("Prime number:-");
        prime(num);
    }
}
