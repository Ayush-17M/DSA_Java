package L4_BinarySearch;

public class Q2_Floor_No {
    static void main() {
//        Find the floor number in an array.
//        floor number :- greatest element in the array that is less than of equal to a given target numbers.
        int[] arr = {2,3,4,5,9,14,16,18};
        int target = 17;
        System.out.println(floorNo(arr,target));
    }
    static int floorNo(int[] arr, int target){
        int start = 0, end = arr.length-1;
        if(target > arr[end -1]){
            return -1;
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return arr[end];
    }
}
