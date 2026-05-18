package Question;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Q2_TSA_of_cuboid {
    static void main() {
        System.out.println("Calculate the total surface area of cuboid:");
        Scanner input = new Scanner(System.in);
        int length,width,height;
        System.out.print("Enter the lenght of cuboid: ");
        length = input.nextInt();
        System.out.print("Enter the width of cuboid: ");
        width = input.nextInt();
        System.out.print("Enter the height of cuboid: ");
        height = input.nextInt();
        long TSA = 2*(length*width + width*height + height*length);
        System.out.printf("Total surface area of cuboid: %d",TSA);
    }
}
