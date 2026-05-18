package Question;
import java.util.Arrays;

public class Q28_SecondLargest_ofArrays {
    static void main() {
//        Input: arr[] = [2, 3, 1, 2, 3]
//        Output: [2, 3]
//        Explanation: 2 and 3 occur more than once in the given array.
        int[] arr = {5,3,3};
        System.out.println(SecondLargest(arr));
    }
    static int SecondLargest(int[] arr) {
        Arrays.sort(arr);
        int Max = arr[0];
        int secMax = -1;
        if (arr.length == 1) {
            return -1;
        }
        else {
            for (int i = 1; i < arr.length; i++) {
                if(arr[i-1] < arr[i]){
                    secMax = Max;
                    Max = arr[i];
                }
            }
        }
        return secMax;
    }
}
