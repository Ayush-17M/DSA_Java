package Question;
import java.util.Scanner;
import java.util.Arrays;

public class Q27sum_diagonalElement {
    static void main() {
        Scanner sc = new Scanner(System.in);
//        WAP to find the sum of two diagonal elements of the matrix.
        System.out.print("Enter the row: ");
        int row = sc.nextInt();
        System.out.print("Enter the colum: ");
        int colum = sc.nextInt();

        int[][] matrix = new int[row][colum];
        for(int i=0; i<row; i++){
            for(int j=0; j<colum; j++){
                System.out.printf("Enter the element matrix [%d][%d]: ",i,j);
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Sum of diagonal Element: "+sumDiagonal(matrix));
    }
    static int sumDiagonal(int[][] matrix){
        int sum = 0;
        for(int i=0; i< matrix.length; i++){
            sum += matrix[i][i];
            int col = matrix.length-1 - i;
            sum += matrix[i][col];
        }
        if(matrix.length % 2 != 0){  //odd
            int med = matrix.length /2;
            sum -= matrix[med][med];
        }
        return sum;
    }
}
