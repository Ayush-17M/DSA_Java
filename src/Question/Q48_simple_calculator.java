package Question;

import java.util.Scanner;

public class Q48_simple_calculator {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Calculator...");
        System.out.print("Enter the operator: ");
        String oper = sc.next();
        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();

        switch (oper){
            case ("+") -> System.out.print("Addition: "+ (num1 + num2));
            case ("-") -> System.out.print("Subtraction: "+(num1 - num2));
            case ("*") -> System.out.print("Multiplication: "+(num1 * num2));
            case ("/") -> System.out.print("Division: "+(num1 / num2));
            default -> System.out.println("Invalid operator enter! Try again..");
        }
    }
}
