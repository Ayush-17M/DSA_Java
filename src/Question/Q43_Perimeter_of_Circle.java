package Question;
import java.util.Scanner;

public class Q43_Perimeter_of_Circle {
    static void main() {
//        Find the perimeter of circle
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int radius = sc.nextInt();
        System.out.printf("Perimeter of circle is: %.2f",findPerimeter(radius));
    }
    static double findPerimeter(int r){
        return 2*Math.PI*r;
    }
}
