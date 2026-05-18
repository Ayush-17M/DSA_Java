package Question;

import java.util.Scanner;

public class Q40_Area_of_Parallelogram {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int len = sc.nextInt();
        System.out.print("Enter the withe of the rectangle: ");
        int width = sc.nextInt();
        System.out.printf("Area of parallelogram: %.2f m^2",findArea(len,width));
    }
    static double findArea(int len,int width){
        return (len*width);
    }
}
