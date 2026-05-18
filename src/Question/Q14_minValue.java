package Question;
import java.util.Arrays;

public class Q14_minValue {
    static void main() {
        System.out.println("Finding the minimum element in this array?");
        int arr[]={34,35,64,89,75,46,67,46,93};
        System.out.println(Arrays.toString(arr));
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("minimum element is: "+min);
    }
}
