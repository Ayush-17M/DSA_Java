package Question;

import java.util.Scanner;

public class Q47_Perimeter_of_Isosceles_Triangle {
    static void main() {
//        find the Perimeter of Isosceles Tringle
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the Isosceles Triangle: ");
        int len = sc.nextInt();
        System.out.print("Enter the width of the Isosceles Triangle: ");
        int with = sc.nextInt();
        System.out.println("Perimeter of Isosceles Triangle: "+ (2*len+with));
    }
}
