package Question;

import java.util.Scanner;

public class Q34_categorize_Student {
    static void main() {
        System.out.println("Based on a student's score, categorize as \"High\", \"Moderate\" and  \"Low\" usint " +
                "Ternary operator...");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you score: ");
        int score = sc.nextInt();
        System.out.println("Student score: "+categorize(score));
    }
    static String categorize(int score){
        return (score >= 50 || score >= 80) ? (score >= 80 ? "High" : "Moderate") : "Low";
    }
}
