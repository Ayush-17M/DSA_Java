package Question;
import java.util.Scanner;

public class Q23_Guess_number {
    public static void main(String[] args){
        System.out.println("Guessing number game: ");
        int system_no = (int)(Math.random()*50);   //give the random number between 0 to 50.
        System.out.println("System no is "+Guess_no(system_no));
    }
    static int Guess_no(int sys_no){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the any number: ");
        int num = sc.nextInt();
        while(true){
            if(num > sys_no){
                System.out.printf("less then %d\n",num);
                Guess_no(sys_no);
                break;
            }
            else if (num < sys_no) {
                System.out.printf("greatest then %d\n",num);
                Guess_no(sys_no);
                break;
            }
            else {
                System.out.printf("Equal to %d\n",num);
                break;
            }
        }
        return sys_no;
    }
}
