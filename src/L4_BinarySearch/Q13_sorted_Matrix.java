package L4_BinarySearch;

import java.util.Arrays;

public class Q13_sorted_Matrix {
    static void main() {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(search(arr,6)));
    }
//    search in the row provided between the cols provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){  // arr 0 0 3 6
        while (cStart <= cEnd){ //0 3
            int mid = cStart + (cEnd - cStart)/2;  // 1
            if(matrix[row][mid] == target){  // 2 == 6
                return new int[]{row,mid};
            } else if (matrix[row][mid] > target) {  //2 > 6
                cEnd = mid-1;
            }
            else {
                cStart = mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;  //4
        int col = matrix[0].length;  //4

        if(rows == 1){
            return binarySearch(matrix,0,0,col-1,target);
        }

        int rStart = 0;
        int rEnd = rows-1;  //1
        int cMid = col/2;  //2
//        run the loop till 2 row are remaining
        while (rStart < (rEnd-1)){  //0 < 1
            int mid = rStart + (rEnd - rStart)/2;  //1
            if(matrix[mid][cMid] == target){  //7 == 6
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid] < target){  //7 < 6
                rStart  = mid;
            }
            else {  //7 > 6
                rEnd = mid;  //1
            }
        }

//        now we have two rows
//        check whether the target is in the col of rows
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart + 1][cMid] == target){
            return new int[]{rStart+1, cMid};
        }
//        search in 1st half
        if(target <= matrix[rStart][cMid - 1]){
            return binarySearch(matrix, rStart, 0, cMid-1,target);
        }
//        search in 2nd half
        if(target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][col-1]){
            return binarySearch(matrix, rStart, cMid+1, col-1,target);
        }
//        search in 3rd half
        if(target <= matrix[rStart + 1][cMid - 1]){
            return binarySearch(matrix, rStart+1, 0, cMid-1,target);
        }
        else {
            return binarySearch(matrix, rStart+1, 0, cMid-1,target);
        }
    }
}
