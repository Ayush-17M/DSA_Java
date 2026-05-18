package Question;
import java.util.Scanner;

public class Q9_prime_num {
    static boolean prime(int num){
        boolean prime = true;
        if(num == 0){
            prime = false;
        }
        for(int i=2; i<num; i++){
            if(num%i == 0){
                prime = false;
                break;
            }
        }
        return prime;
    }
    public static void main() {
        System.out.println("Find the given number is prime or not!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = input.nextInt();

        if(prime(num)){
            System.out.printf("%d is prime number.",num);
        }
        else{
            System.out.printf("%d is not prime number.",num);
        }
    }
}
