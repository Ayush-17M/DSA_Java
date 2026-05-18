package Question;
import java.util.Arrays;
public class Q17_reverse_array {
    static void main() {
//        Q5. write a java program to reverse an array.
        System.out.print("\nGiven array is:");
        int[] reverseArray = {28,39,49,20,57,93,29};
        System.out.println(Arrays.toString(reverseArray));
        int arrayLength = reverseArray.length;
        System.out.print("After reversing the array: ");
        if(arrayLength % 2 == 0){
            for(int i=0;i<arrayLength/2;i++){
                int element = reverseArray[i];
                reverseArray[i] = reverseArray[arrayLength-1-i];
                reverseArray[arrayLength-1-i] = element;
            }
        }
        else{
            for(int i=0;i<arrayLength/2+1; i++){
                int element = reverseArray[i];
                reverseArray[i] = reverseArray[arrayLength-1-i];
                reverseArray[arrayLength-1-i] = element;
            }
        }
        System.out.println(Arrays.toString(reverseArray));
    }
}
