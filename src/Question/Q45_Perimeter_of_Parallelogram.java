package Question;

import java.util.Scanner;

public class Q45_Perimeter_of_Parallelogram {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the Parallelogram: ");
        int len = sc.nextInt();
        System.out.print("Enter the width of the Parallelogram: ");
        int with = sc.nextInt();
        System.out.println("Perimeter of Parallelogram: "+ 2*(len+with));
    }
}
