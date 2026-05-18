package Question;

import java.util.Scanner;

public class Q46_Perimeter_of_rectangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width of the Rectangle: ");
        int width = sc.nextInt();
        System.out.print("Enter the height of the Rectangle: ");
        int height = sc.nextInt();
        System.out.println("Perimeter of Rectangle: "+ 2*(width+height));
    }
}
