package Question;
import java.util.Scanner;

public class Q13_bitwise_operator {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter the 1st number: ");
        num1 = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        num2 = sc.nextInt();

//        Q1. Create a program that show bitwise AND (&) of two number.
        System.out.println("Bitwise AND (&) operators.");
        AND_Operator(num1,num2);  // method call

//        Q2.Create a program that shows bitwise OR (|) of two number.
        System.out.println("Bitwise OR (|) operators.");
        OR_Operator(num1,num2);  // method call

//        Q3.Create a program that shows bitwise XOR (|) of two number.
        System.out.println("Bitwise XOR (^) operators.");
        XOR_Operator(num1,num2);  // method call

//        Q4.Create a program that shows bitwise XOR (|) of two number.
        System.out.println("Bitwise NOR / Compliment (~) operators.");
        NOR_Operator(num1);  // method call

//        Q3.Create a program that shows use of left shift operator.
        System.out.println("Bitwise left Shift (<<) operators.");
        left_shift(num1);  // method call

//        Q3.Create a program that shows use of right shift operator.
        System.out.println("Bitwise right shift (>>) operators.");
        right_shift(num1);  // method call
    }

    //first number are convert into binary number then operation apply on it.
//    & operator --> 1 & 1 = 1, 1 & 0 = 0, 0 & 1 = 0, 0 & 0 = 0
    static void AND_Operator(int a,int b){
        int result = a & b;
        System.out.printf("%d & %d = %d \n",a,b,result);
    }
//    | operator --> 1 | 1 = 1, 1 | 0 = 1, 0 | 1 = 1, 0 | 0 = 0
    static void OR_Operator(int a,int b){
        int result = a | b;
        System.out.printf("%d | %d = %d \n",a,b,result);
    }
//     ^ operator --> 1 ^ 1 = 0, 1 ^ 0 = 1, 0 ^ 1 = 1, 0 ^ 0 = 0
    static void XOR_Operator(int a,int b){
        int result = a ^ b;
        System.out.printf("%d ^ %d = %d \n",a,b,result);
    }
//    ^ operator --> ~1 = 0, ~0 = 1
    static void NOR_Operator(int a){
        int result = ~a ;
        System.out.printf("  ~%d = %d \n",a,result);
    }
//    left_shift(<<) operator   (a*2)
    static void left_shift(int a){
        int result = a << 1 ;
        System.out.printf("%d << 1 = %d \n",a,result);
    }
//    right_shift(>>) operator  (a/2)
    static void right_shift(int a){
        int result = a >> 1 ;
        System.out.printf("%d >> 1 = %d \n",a,result);
    }
}
