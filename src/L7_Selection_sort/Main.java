package L7_Selection_sort;
import java.util.*;

public class Main {
    static void main(String[] args) {
//        int[] arr = {3,1,5,4,2};
//        int[] arr = {5,4,3,2,1};
//        int[] arr = {5,2};
//        int[] arr = {3,0,-9,-56,58,0};
        int[] arr = {1};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    static int getMaxIndex(int[] arr,int start, int end){
        int max = start;
        for(int i=start; i<=end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
