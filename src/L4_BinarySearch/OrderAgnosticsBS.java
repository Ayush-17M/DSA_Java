package L4_BinarySearch;

public class OrderAgnosticsBS {
    public static void main() {
//        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int[] arr = {89,45,22,18,16,15,4,3,2,0,-4,-12,-18};
        int target = -12;
        int ans = OrderAgnosticsBS(arr,target);
        System.out.println(ans);
    }
    static int OrderAgnosticsBS(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;
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
