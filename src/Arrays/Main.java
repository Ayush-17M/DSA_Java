package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main() {

        Scanner input = new Scanner(System.in);

//        Syntax of array.
//        datatypes[] variable_name = new datatype[size];

//        store 5 roll number.
//        int[] rnos = new int[5];
//        or directly
//        int[] rnos2 = {23,12,45,32,15};

        int[] ros; // declaration of array. ros is getting defined in the stack.
        ros = new int[5]; //actually here object is being created in the memory (heap).
        System.out.printf("Array element in integer: %d \n", ros[0]);

        String[] arr;
        arr = new String[5];
        System.out.print("Array element in String :");
        System.out.println(arr[0]);

        int[] array={1,2,5,5,6,2,};
        System.out.println(Arrays.toString(array));

//        1. Array object are in heap memory.
//        2. Heap object are not continuous.
//        -->Array in c or c++ memory allocation continuous but not in java.
//        3. Dynamic memory allocation.

//        2D-Array:
//         int[][] arr2D = new int[3][];

//        int[][] arr2D = {
//                {1,2,3},  //0th index
//                {4,5},  //1st index
//                {6,7,8,9}  //2nd index -> arr2D[2] = {6,7,8,9}
//              };

        int[][] arr2D = new int[3][3];
        System.out.println(arr2D.length); // print the no of row.
//        input
        System.out.print("Enter the 9 element of the array: ");
        for(int row=0; row<arr2D.length;row++){
            for(int col=0; col<arr2D[row].length; col++){
                arr2D[row][col] = input.nextInt();
            }
        }
//        output
        System.out.println("Output using for loop.");
        for(int row=0;row<arr2D.length;row++){
            for(int col=0;col<arr2D[row].length;col++){
                System.out.print("  "+arr2D[row][col]);
            }
            System.out.println("");
        }

        System.out.println("Output using array laberay.");
        for(int row=0; row<arr2D.length;row++) {
            System.out.println(Arrays.toString(arr2D[row]));
        }

        System.out.println("Output using for each loop.");
        for(int[] a : arr2D){
            System.out.println(Arrays.toString(a));
        }
    }
}
