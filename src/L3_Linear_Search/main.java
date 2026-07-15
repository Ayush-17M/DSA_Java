package L3_Linear_Search;

public class main {
    static void main(String[] args) {
        int[] nums = {12, 54, 3, 25, 8, 19, 63, 54, 43, 32, 93};
        int target = 19;
        int ans = linerSearch(nums, target);
        if(ans != -1){
            System.out.printf("%d is found in index: %d \n",target,ans);
        }else{
            System.out.printf("%d is not found in index: %d \n",target,ans);
        }
    }

    //    search in the array: return the index of item found
//    otherwise if item not found return -1.
    static int linerSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
//        run a for loop
        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
//        This line will execute of none of the return statements above have executed
//        hence the target not found
        return -1;
    }
}
