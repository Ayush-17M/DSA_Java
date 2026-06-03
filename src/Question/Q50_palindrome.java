package Question;
import java.sql.Struct;
import java.util.Scanner;

public class Q50_palindrome {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to palindrome checker: ");
        System.out.print("Enter the String to be checked: ");
        String str = sc.next();
        System.out.println("Your String is " + (isPalindrome(str) ? "Palindrome" : "Not Palindrome"));
    }
    static boolean isPalindrome(String str){
        if(str.length() <= 1){
            return true;
        }
        int lastPos = str.length()-1;
        if(str.charAt(0) != str.charAt(lastPos)){
            return false;
        }
        String newStr = str.substring(1,lastPos);
        return isPalindrome(newStr);
    }
}
