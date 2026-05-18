package Question;

import java.util.Arrays;

public class Q30_max_product_2No {
    static void main() {
        int[] arr = {10, 67, 25, 64, 75, 90, 51, 41, 44, 78, 19, 80};
        System.out.println(maxProduct(arr));
    }
    static int maxProduct(int[] arr){
        int size= arr.length;
        Arrays.sort(arr);
        return (arr[size-2]*arr[size-1]);
    }
}
