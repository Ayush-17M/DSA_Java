package Question;
import java.util.Scanner;

public class Q1_volumek_of_sphere {
    public static void main() {
//        Calculate volume of sphere
        System.out.println("Calculate volume of sphere");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of sphere: ");
        float radius = input.nextFloat();
        double volume = (4.0/3.0)*3.14 * (radius*radius*radius);
        System.out.printf("Volume of sphere : %f",volume);
    }
}
