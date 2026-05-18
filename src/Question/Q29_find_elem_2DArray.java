package Question;

public class Q29_find_elem_2DArray {
    static void main() {
        int[][] arr = {{6, 23, 21},{4, 45, 32},{69, 11, 87}};
        int target = 32;
        System.out.println(searchMatrix(arr,target));
    }
    static boolean searchMatrix(int[][] mat, int x) {
        // code here
        boolean ans = false;
        for(int i=0; i< mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j] == x){
                    ans = true;
                }
            }
        }
        return ans;
    }
}
