package L28_Count_Sort;

import java.util.Arrays;

public class Main {
    public static void countSort(int[] arr){
        if(arr == null || arr.length <= 1){
            return;
        }
        int maxValue = arr[0];
        for(int ele: arr){  // finding the max value in array.
            maxValue = Math.max(maxValue, ele);
        }

        int[] countArray = new int[maxValue + 1]; // creating the new arr, length = max value + 1 to store the frequency

        for(int ele: arr){ // insert frequency
            countArray[ele]++;
        }
        int index = 0;
        for(int i = 0; i < maxValue; i++){ // soring happen

            while (countArray[i] > 0){
                arr[index] = i;
                index++;
                countArray[i]--;
            }
        }
    }
    public static void main() {
        int[] array = {3,4,1,3,2,5,2,8};
        countSort(array);

        System.out.println(Arrays.toString(array));
    }
}
