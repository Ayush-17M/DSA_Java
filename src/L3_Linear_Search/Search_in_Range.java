package L3_Linear_Search;
import java.util.Arrays;
import java.util.Scanner;

public class Search_in_Range {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int[] arr ={18,12,-7,3,14,28};
        System.out.println("Given array:"+Arrays.toString(arr));
        System.out.println("Enter the starting index: ");
        int start = sc.nextInt();
        System.out.println("Enter the Ending index: ");
        int end = sc.nextInt();
        System.out.println("Enter the target element: ");
        int target= sc.nextInt();
        int resule = linearSearch(arr,start,end,target);
        if(resule != -1) {
            System.out.printf("%d at index: %d", target,resule);
        }else{
            System.out.printf("%d is not found at any index: %d", target,resule);

        }
    }
    static int linearSearch(int[] arr,int start,int end,int target){
        if(arr.length == 0){
            return -1;
        }
//        run  a for loop
        for(int i = start;i<=end;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
