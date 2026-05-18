package Question;

import java.util.Scanner;

public class Q35_month_of_year {
    static void main() {
        System.out.println("Print the month of the year based on a  number(1-12) input by the user.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month in number: ");
        int num = sc.nextInt();
        System.out.println("Month of year: "+monthOfYear(num));
    }
    static String monthOfYear(int num){
        return switch (num){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid input";
        };
    }
}
