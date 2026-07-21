package Arrays;
import java.util.*;

public class Q34_Shift_2D_Grid_1260 {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length; // no of row
        int n = grid[0].length;  // no of col

        k %= (m * n);

        int[] arr = new int[m * n];
        int idx = 0;

        // store in array
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                arr[idx++] = grid[r][c];
            }
        }

        int j = (arr.length - k) % arr.length; // array rotate

        List<List<Integer>> ans = new ArrayList<>();

        for (int r = 0; r < m; r++) {
            List<Integer> list = new ArrayList<>();

            for (int c = 0; c < n; c++) {
                list.add(arr[j]);
                j = (j + 1) % arr.length; // if j == length -> j = 0.
            }

            ans.add(list);
        }

        return ans;
    }
}
