package Greedy;
import java.util.Arrays;

public class Q4_Split_Min_sum_2578 {

    public int splitNum(int num) {
        int n = num;
        int count = 0;
        while(n > 0){ // count the no of digit
            count++;
            n /= 10;
        }

        int[] arr = new int[count]; // create the array of size count
        for(int i = 0; i < count; i++){ // insert the digit in array
            arr[i] = num % 10;
            num /= 10;
        }

        Arrays.sort(arr);

        int num1 = 0;
        int num2 = 0;
        for(int j = 0; j < count; j++){
            if(j % 2 == 0) { // elenent present in even position
                num1 = (num1 * 10) + arr[j];
            }else{ // in odd position
                num2 = (num2 * 10) + arr[j];
            }
        }

        return num1 + num2;
    }

}
