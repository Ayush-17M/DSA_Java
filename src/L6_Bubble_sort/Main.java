package L6_Bubble_sort;

import java.util.*;

public class Main {
    static void main() {
//         int arr[] = {3,1,5,4,2};
//         int arr[] = {1,2,3,4,5};
//         int arr[] = {-1,7,-32,0,89};
         int arr[] = {1,1,1,1,1,1};
         bubble(arr);
    }
    static void bubble(int[] arr) {
        boolean swapped;
//        run the steps n-1 times
        for(int i=0; i < arr.length; i++){
            swapped = false;
//            for each step, max item will come at the last resective index
            for(int j=1; j<arr.length-i; j++){
//                swap if the item is smaller than the previous item
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
//            if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if(!swapped){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
