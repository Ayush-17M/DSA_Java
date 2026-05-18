package Question;
import java.util.*;

public class Q37_Area_Of_Triangle {
    static void main() {
//        Find the area of triangle
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the triangle: ");
        int len = sc.nextInt();
        System.out.print("Enter the withe of the triangle: ");
        int width = sc.nextInt();
        System.out.print("Enter the withe of the triangle: ");
        int height = sc.nextInt();
        System.out.printf("Area of Triangle: %.2f",findArea(len, width ,height));
    }
    static double findArea(int len,int width,int height){
        int s =  (len+width+height)/2;
        return Math.sqrt(s*(s-len)*(s-width)*(s-height));
    }
}
