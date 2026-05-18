package Question;

public class Q12_n_Anstrome_nnum {
    static boolean isArmstrong(int num){
        int sum =0, original = num;
        while(num>0){
            int rem = num%10;
            sum += Math.pow(rem,3);
            num = num/10;
        }
        return sum == original;
    }
    public static void main() {
        System.out.println("Finding the 3 digit armstrong number!");
        for(int i=100;i<1000;i++){
            if(isArmstrong(i)){
                System.out.print(" "+i);
            }
        }
    }
}
