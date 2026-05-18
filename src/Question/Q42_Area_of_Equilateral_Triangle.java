package Question;

import java.util.Scanner;

public class Q42_Area_of_Equilateral_Triangle {
    static void main() {
//        Find the area of equilateral triangle
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the triangle: ");
        int side = sc.nextInt();
        System.out.printf("Area of Triangle: %.2f",findArea(side));
    }
    static double findArea(int side){
        return Math.sqrt(3)/4 * Math.pow(side,2);
    }
}
