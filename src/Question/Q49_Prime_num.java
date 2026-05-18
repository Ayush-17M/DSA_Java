package Question;
import java.util.Scanner;

public class Q49_Prime_num {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Finding the prime number: ");
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        System.out.println("Your number is "+(isPrime(num) ? "Prime" : "Not Prime"));
    }
    static boolean isPrime(int num){
        if(num == 1 ){
            return false;
        }
        if(num == 2 ){
            return true;
        }
        for(int i=2; i<num ; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
