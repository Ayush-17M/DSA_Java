package Binary_Search;

public class Q1_Search_Insert_Position_35 {
    static void main() {
//        Given a sorted array of distinct integers and a target value, return the index if the target is found.
//        If not, return the index where it would be if it were inserted in order.
        int[] arr = {1,3,5,6};
        int targer=7;
        System.out.println(searchInsert(arr,targer));
    }
//    static int searchInsert(int[] nums, int target){
//        int index=0;
//        for(int ele: nums){
//            if(ele < target){
//                index++;
//            }
//        }
//        return index;
//    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = end - start / 2 + start;

            if(nums[mid] == target){
                return mid;
            }
            if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
}
