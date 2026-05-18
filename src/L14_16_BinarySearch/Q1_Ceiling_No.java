package L14_16_BinarySearch;

public class Q1_Ceiling_No {
    public static void main() {
//        Find the ceiling number in an array;
//        ceiling number :- Smellest element in array greater or equal to a given target numbers.
        int[] arr = {2,3,4,5,9,13,14,16,18};
        int target = 6;
        System.out.println(ceilingNo(arr,target));
    }
    static int ceilingNo(int[] arr, int target){
        int start = 0, end = arr.length-1;
        if(target > arr[end-1]){
            return -1;
        }
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return arr[mid];
            }
            else if(arr[mid] < target){
                start = mid +1;
            }
            else{
                end = mid - 1;
            }
        }
        return arr[start];
    }
}
