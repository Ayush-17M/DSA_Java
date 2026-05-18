package Question;
import java.util.Scanner;
import java.util.Arrays;

public class Q4_fibonacci {
    static int[] fibonacci(int number){
        int sum=0, a=0, b=1;
        int arr[] = new int[number];
        for(int i=0;i<number;i++){
            arr[i]=sum;
            sum = a+b;
            a = b;
            b = sum;
        }
        return arr;
    }
    static void main() {
        System.out.println("Find the Fibonacci series: ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        System.out.print("Fibonacci Series: ");
        System.out.println(Arrays.toString(fibonacci(n)));

        int p = 0;
        int i = 1;
        int count = 2;
        while(count <= n){
            int temp = i;
            i = i+p;
            p = temp;
            count++;
        }
        System.out.printf("%d fibonacci is : %d",n,i);
    }
}
