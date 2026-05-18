package Question;
import java.util.Arrays;

public class Q15_maxValue {
    static void main() {
        System.out.println("Finding the maximum element in this array?");
        int arr[]={34,35,64,89,75,46,67,46,93};
        System.out.println(Arrays.toString(arr));
        int max = Integer.MIN_VALUE;  //-2147483648 assigned the min value.
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("maximum element is: "+max);
    }
}
