package L14_16_BinarySearch;
import java.util.Arrays;

public class Q4_first_last_positionElement_34 {
    static void main() {
        int[] arr = {5,5,7,8,8,8,10};
        int target = 5;
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }
    static int[] searchRange(int[] nums,int target){
        int[] newArr = {-1,-1};
        int startIndex = searchIndex(nums,target,true);
        int endIndex =searchIndex(nums,target,false);
        newArr[0]=startIndex;
        newArr[1]=endIndex;
        return  newArr;
    }
    static int searchIndex(int[] nums,int target,boolean startIndex){
        int start=0, end=nums.length-1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid-1;
            }
            else if(target > nums[mid]) {
                start = mid+1;
            }
            else{
                ans = mid;
                if(startIndex){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
