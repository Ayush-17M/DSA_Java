package Question;

import java.util.Scanner;

public class Q32_Even_Odd {
    static void main() {
        System.out.println("Find if the given number is even or odd...");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Give number is : " + EvenOrOdd(num));
    }
    static String EvenOrOdd(int num){
        return  num % 2 == 0 ? "Even" : "Odd";
    }
}
