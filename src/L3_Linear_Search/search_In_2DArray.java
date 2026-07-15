package L3_Linear_Search;
import java.util.Arrays;
import java.util.Scanner;

public class search_In_2DArray {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Searching the element in this 2D array:\n");
        int[][] arr = {     //2D arrays
                {23,4,1},
                {18,62,3,9},
                {78,99,34,56},
                {18,12}
        };
//        printing the 2d array element
//        M-1:
        System.out.println("Printing the 2D array:");
        System.out.println("Method: 1");
        System.out.println(Arrays.deepToString(arr));
//        M-2:
        System.out.println("\nMethod: 2");
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
//        M3:Advance java(foreach loop)
        System.out.println("\nMethod: 3");

        Arrays.stream(arr)
                .forEach(a -> System.out.println(Arrays.toString(a)));

        System.out.print("\nEnter the target element in 2D array: ");
        int target = sc.nextInt();
        int[] ans = search(arr,target);
        System.out.println("index at the value:"+Arrays.toString(ans));


//        Finding the maximum value;
        System.out.println("Finding the maximum value:  ");
        System.out.println("Finding the maximum value in the array: "+max(arr));
    }


    static int[] search(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                int element = arr[row][col];
                if(element == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

//    finding the maximum value method:
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
//        using for each loop
        for(int [] item : arr){
            for(int element : item){
                if(element > max){
                    max = element;
                }
            }
        }
        return max;
    }
}
