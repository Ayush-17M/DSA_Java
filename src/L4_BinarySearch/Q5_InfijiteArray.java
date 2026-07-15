package L4_BinarySearch;

public class Q5_InfijiteArray {
    static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr,target));

    }
    static int ans(int[] arr,int target){
//        first find the range
//        first start with a box of size 2
        int start = 0;
        int end = 1;

        while(true){
//        Condition for the target to  lie in the range
            try {
                if (target <= arr[end]) {
                   break;
                }
                int newStart = end + 1;    // this is my new start
//              double the box value
//              end = previous end + sizeOfBox * 2
                end = end + (end - start + 1) * 2;
                start = newStart;

            } catch (ArrayIndexOutOfBoundsException e) {
                // end went outside array, stop expanding
                break;
            }
        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr, int target,int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]) {
                start = mid + 1;
            }
            else if (target < arr[mid]) {
                end = mid-1;
            }
            else{
                return mid;  //return index
            }
        }
        return -1;
    }
}
