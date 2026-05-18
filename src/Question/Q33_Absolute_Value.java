package Question;

import java.util.Scanner;

public class Q33_Absolute_Value {
    static void main() {
        System.out.println("Calculate the absolute value of a given integer...");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Absolute value of number is : " + absoluteValue(num));
    }
    static int absoluteValue (int num){
        return (num < 0 ? -1*num : num);
    }
}
