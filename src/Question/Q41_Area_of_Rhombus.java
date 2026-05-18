package Question;

import java.util.Scanner;

public class Q41_Area_of_Rhombus {
    static void main() {
        Scanner sc = new Scanner(System.in);
        // Input diagonals
        System.out.print("Enter first diagonal (d1): ");
        double d1 = sc.nextDouble();
        System.out.print("Enter second diagonal (d2): ");
        double d2 = sc.nextDouble();

        // Calculate area
        double area = (d1 * d2) / 2;
        System.out.println("Area of Rhombus = " + area);

    }
}
