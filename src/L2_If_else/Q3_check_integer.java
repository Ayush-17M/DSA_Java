package L2_If_else;
import java.util.Scanner;

public class Q3_check_integer {
    static void main() {
        System.out.println("Take real number input and check if it is an integer or not.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        double num = input.nextDouble();
        int x = (int)num;  //Type casting
        if(num-x==0){
            System.out.printf("%f number is integer.",num);
        }
        else{
            System.out.printf("%f number is not integer.",num);
        }
    }
}
