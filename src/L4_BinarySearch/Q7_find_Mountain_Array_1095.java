package L4_BinarySearch;

public class Q7_find_Mountain_Array_1095 {
    static void main() {
        int[] arr = {1,2,3,5,6,4,3,2};
        System.out.println(MountainArray(arr));
    }
    int search(int[] arr, int target){
        int peak = MountainArray(arr);
        int firsTry = OrderAgnosticsBS(arr, target,0,peak);
        if(firsTry != -1){
            return firsTry;
        }
//        try to search in second half
        return OrderAgnosticsBS(arr,target,peak+1,arr.length-1);
    }

    static int MountainArray(int[] arr){
        int start = 0,end = arr.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
//                you are in dec part of array
//                this may be the ans, but look at left
//                this is why end != min-1
                end = mid;
            }
            else{
//                you are in asc part of array
                start = mid+1; //because we know that mid+1 element > mid element
            }
        }

        return arr[start];
    }
    static int OrderAgnosticsBS(int[]arr, int target, int start, int end){
//        find whether tha array is sorter in ascending or descending.
        boolean isAss = arr[start] < arr[end];

        while(start <= end){
            int mid = start+(end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
//            if array is Ascending
            if(isAss){
                if (target < arr[mid]) {
                    end = mid -1;
                }
                else {
                    start = mid + 1;
                }
            }
            else{
                if(target < arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
