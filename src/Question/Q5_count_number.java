package Question;
import java.util.Arrays;
import java.lang.Math;

public class Q5_count_number {
    static void main(String[] args) {
        int arr[] = {1,3,8,5,7,5,7,8,7,9};
        System.out.println(Arrays.toString(arr));
        System.out.println("Count the number of 7: ");
        int count = 0;
        for(int element: arr){
            if(element == 7){
                count++;
            }
        }
        System.out.println("Number of 7 come: "+count);

        int number = 1385757879;
        System.out.println(number);
        int i=0;
        while(number>0){
            if(number%10 == 7){
                i++;
            }
            number = number/10;
//            System.out.println(number);
        }
        System.out.println("using while loop");
        System.out.println("using while: "+i);

        int num = 123456;
        System.out.println("Given number: "+num);
        System.out.println("using shortcut for count digit:  ");
        System.out.println("number of digit: "+digit(num));
    }
    static int digit(int num){
        return (int)(Math.log10(num))+1;  // type casting is necessary because Math.log10 return double data type value (10.0).
    }
}
