package Question;

import java.util.*;

public class Q36_Area_of_circle {
    static void main() {
//        Find the area of circle
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int radius = sc.nextInt();
        System.out.printf("Area of circle: %.2f",findArea(radius));
    }
    static double findArea(int r){
        return (Math.PI*Math.pow(r,2));
    }
}
