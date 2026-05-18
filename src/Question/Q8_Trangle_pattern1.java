package Question;
import java.util.Scanner;

public class Q8_Trangle_pattern1 {
    static void main() {
//        Show the following patterns
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
        Scanner input = new Scanner(System.in);
        System.out.println("1.Triangle pattern: ");
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        for(int i=1;i<=num;i++ ){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println("");
        }
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
        System.out.println("2.Triangle pattern: ");
        System.out.print("Enter the number: ");
        int num1 = input.nextInt();
        for(int i=0;i<num1;i++){
            for(int j=0;j<num1-i;j++){
                System.out.print(" *");
            }
            System.out.println("");
        }

//               *
//             * *
//           * * *
//         * * * *
        System.out.println("3.Triangle pattern: ");
        System.out.print("Enter the number: ");
        int num2 = input.nextInt();
        for(int i=0;i<num2;i++){
            for(int j=0;j<num2-1-i;j++){
                System.out.print("  ");
            }
            for(int k=0;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
//        *  *  *  *
//        *  *  *  *
//        *  *  *  *
//        *  *  *  *
        System.out.println("3.Triangle pattern: ");
        System.out.print("Enter the number: ");
        int num3 = input.nextInt();
        for(int i=0;i<num3;i++){
            for(int j=0;j<num3;j++){
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
