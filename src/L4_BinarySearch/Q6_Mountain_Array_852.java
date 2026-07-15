package L4_BinarySearch;

public class Q6_Mountain_Array_852 {
    static void main() {
        int[] arr = {1,2,3,5,6,4,3,2};
        System.out.println(MountainArray(arr));
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
}
