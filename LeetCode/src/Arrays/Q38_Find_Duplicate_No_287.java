package Arrays;

public class Q38_Find_Duplicate_No_287 {

    public int findDuplicate(int[] nums) {
        // Start a fast and slow pointer
        int slow = 0;
        int fast = 0;

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while (slow != fast);

        // pointers at same speed until they meet again
        slow = 0;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

}
