package Question;

public class Q6_reverse_num {
    static void main() {
        int num = 23497;
        System.out.println("Given number is: "+num);
        int reverse_num = 0;
        while(num>0){
            reverse_num = reverse_num * 10 + (num%10);
            num = num/10;
        }
        System.out.println("Reverse number is: "+reverse_num);
    }
}
