package Question;
import java.util.Scanner;

public class Q11_Armstrong_num {
    public static void main() {
        System.out.println("Armstrong number are not1");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the any number: ");
        int num = input.nextInt();
        int number = num;
        double sum = 0;
        while(num>0){
            double x = num%10 ;
            sum += Math.pow(x,3);
            System.out.printf("cube o.0f %f is + sum: %.0f\n",x,sum);
            num = num/10;
        }
        if(number == sum){
            System.out.printf("\n%d is a Armstrong number. ",number);
        }
        else{
            System.out.printf("\n%d is not a Armstrong number.",number);
        }
    }
}
