package Question;
import java.util.Scanner;
import java.util.Arrays;

public class Q25_DeleteFrom_Array {
    static void main() {
        System.out.println("Welcome to Array Deletion");
        Scanner sc  = new Scanner(System.in);
        int[] numArr = Q24_ArrayUtility.inputArray();
        System.out.print("Enter the number you want ot delete: ");
        int number = sc.nextInt();
        int[] newArr = deleteNumber(numArr,number);
        System.out.println("new array: "+Arrays.toString(newArr));
    }

    static int[] deleteNumber(int[] arr, int num){
        int count=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i] == num) count++;
        }
        int[] newArr = new int[arr.length-count];
        int j=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i] == num) {
                continue;
            }
            else {
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;
    }
}
