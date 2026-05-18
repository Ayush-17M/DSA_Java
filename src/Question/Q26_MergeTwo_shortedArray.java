package Question;
import java.util.Arrays;

public class Q26_MergeTwo_shortedArray {
    static void main() {
        System.out.println("Welcome to Merging sorted arrays....");
        int[] arr1 = Q24_ArrayUtility.inputArray();
        int[] arr2 = Q24_ArrayUtility.inputArray();
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println("Merged array.");
        System.out.println(Arrays.toString(merged(arr1,arr2)));
    }
    static int[] merged(int[] arr1,int[] arr2){
        int newSize = arr1.length + arr2.length;
        int[] newArr = new int[newSize];
        int i=0,j=0,k=0;
        while(i < arr1.length || j < arr2.length){
            if(j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])){
                newArr[k] = arr1[i];
                i++;
                k++;
            }
            else{
                newArr[k] = arr2[j];
                j++;
                k++;
            }
        }
        return newArr;
    }
}
