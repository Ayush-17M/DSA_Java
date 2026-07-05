package Arrays;
//https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1

// Input: arr[] = [1, 2, 3, 7, 5], target = 12
//Output: [2, 4]
//Explanation: The sum of elements from 2nd to 4th position is 12.

import java.util.ArrayList;

public class Q33_index_of_Subarray_Sum {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> list = new ArrayList<>();

        int start = 0;
        int sum = 0;

        for(int end = 0; end < arr.length; end++){
            sum += arr[end];

            while(sum > target){
                sum -= arr[start];
                start++;
            }

            if(sum == target){
                list.add(start + 1);
                list.add(end + 1);
                return list;
            }
        }
        list.add(-1);
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int target = 23;
        ArrayList<Integer> res = subarraySum(arr, target);

        for (int ele : res)
            System.out.print(ele + " ");
    }
}
