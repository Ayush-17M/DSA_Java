package Question;

import java.util.Scanner;

public class Q44_Perimeter_of_Equilateral_Triangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the Tringle: ");
        int side = sc.nextInt();
        System.out.println("Perimeter of Equilateral Tringle: "+3*side);
    }
}
