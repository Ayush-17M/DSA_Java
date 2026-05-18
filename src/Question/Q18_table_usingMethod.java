package Question;
import java.util.Scanner;

public class Q18_table_usingMethod {
    static void main() {
//        Write a program that prints the multiplication table for a give number using method.
        System.out.println("prints the multiplication table for a give number using method.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        table(num);
    }
    static void table(int num){
        int i=1;
        while(i<11){
            System.out.printf("%d x %d = %d\n",num,i,num*i);
            i++;
        }
    }
}
