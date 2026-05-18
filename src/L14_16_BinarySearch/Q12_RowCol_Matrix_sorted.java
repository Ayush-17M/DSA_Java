package L14_16_BinarySearch;
import java.util.Arrays;

public class Q12_RowCol_Matrix_sorted {
    static void main() {
        int[][] arr = {{10,20,30,40},{15,25,35,45},{28,29,37,45},{33,34,38,50}};
        System.out.println(Arrays.toString(search(arr,50)));
    }
    static int[] search(int[][] matrix, int target){
        int r=0;
        int c = matrix[0].length - 1;  // last column index
        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}
