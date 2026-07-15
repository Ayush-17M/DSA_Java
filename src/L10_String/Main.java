package L10_String;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main() {
//        String comparison
        String a =new String("Ayush");
        String b = new String("Ayush");
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println();
        String name1 ="Ayush";
        String name2 = "Ayush";
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

        String st = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            st += ch;
        }
        System.out.println(st);   //  here String is immutable so String are create new object every time when loop run.
//        That is the reason we will use stringBuilder. stringBuilder in mutable it can change or modify.

        String name = "Ayush Kumar Hello world";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("    Ayush    ".strip());    //remove the space
        System.out.println(Arrays.toString(name.split(" ")));

//        WAP to check the String in palindrome or not.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next();
        str = str.toLowerCase();
        System.out.println("Given String is " + (palindrome(str) ? "palindrome" : "not palindrome"));
    }
    static boolean palindrome (String str){
        int start=0;
        int end = str.length()-1;
        while(start < end){
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
