package Question;

import java.util.Scanner;

public class Q39_Area_Of_Isosceles_Triangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        int base = sc.nextInt();
        System.out.print("Enter the height of the triangle: ");
        int height = sc.nextInt();
        System.out.printf("Area of Isosceles Triangle: %.2f",findArea(base ,height));
    }
    static double findArea(int width,int height){
        return (width+height)/2;
    }
}
