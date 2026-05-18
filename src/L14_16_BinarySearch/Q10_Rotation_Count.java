package L14_16_BinarySearch;

public class Q10_Rotation_Count {
    static void main() {
        int[] arr = {2,9,2,2,2};
        System.out.println(countRotations(arr));
    }
    static int countRotations(int[] arr){
        int pivot = findPivo(arr);
        return pivot+1;
    }

    static int findPivo(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
//            4 case over here
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end  = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
//                Skip the duplicates
//                NOTE: What if these elements at start and ene were the pivot??
//                check if start is pivot
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;

//              check whether end is pivot
                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
//            left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[mid-1])) {
                start = mid+1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
