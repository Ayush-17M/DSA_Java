package L2_If_else;
import java.util.Scanner;

public class Q6_print_day {
    static void main() {
        Scanner input = new Scanner(System.in); //object
        System.out.println("Printing the sunday monday:");
        System.out.print("Enter the number 1 to 7: ");
        int day = input.nextInt();
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Please try again!");
        }

        switch (day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }
    }
}
