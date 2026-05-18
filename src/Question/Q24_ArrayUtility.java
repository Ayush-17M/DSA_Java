package Question;

import java.util.Scanner;

public class Q24_ArrayUtility {
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0; i<size; i++) {
            System.out.printf("Enter the element %d : ", (i + 1));
            array[i] = sc.nextInt();
        }
        return array;
    }
}
