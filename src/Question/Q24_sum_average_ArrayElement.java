package Question;
import java.util.Scanner;
import java.util.Arrays;

public class Q24_sum_average_ArrayElement {
    public static void main() {
//        Create a program to find the sum and average of all elements in an array.
        System.out.println("Welcome to Array sum and average:");
        int[] numArray = Q24_ArrayUtility.inputArray();  // calling the ArrayUtility Class
        System.out.println("Sum of array element : "+ sum(numArray));
        System.out.println("Average of array element : "+ average(numArray));
    }
    static int sum(int[] array){
        int sum = 0;
        for(int i=0; i<array.length;i++){
            sum += array[i];
        }
        return sum;
    }static double average(int[] array){
        double sum = 0;
        for(int i=0; i<array.length;i++){
            sum += array[i];
        }
        return sum/array.length;
    }
}
