package Question;
import java.util.Scanner;

public class Q7_Calculator {
    static void main() {
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the operator: ");
            char operator = input.next().trim().charAt(0);
            int ans = 0;
            if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%'){
                System.out.print("Enter the 1st number: ");
                int num1 = input.nextInt();
                System.out.print("Enter the 2st number: ");
                int num2 = input.nextInt();
                if(operator == '+'){
                    ans = num1+num2;
                }
                if(operator == '-'){
                    ans = num1-num2;
                }
                if(operator == '*'){
                    ans = num1*num2;
                }
                if(operator == '/' && num2 !=0){
                    ans = num1/num2;
                }
                if(operator == '%'){
                    ans = num1%num2;
                }
            }
            else if(operator =='x' || operator == 'X'){
                break;
            }
            else{
                System.out.println("Invalid Operation!");
            }
            System.out.println(ans);
        }
    }
}
