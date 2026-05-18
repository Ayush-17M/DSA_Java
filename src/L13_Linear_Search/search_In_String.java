package L13_Linear_Search;
import java.util.Arrays;

public class search_In_String {
    static void main(String[] args) {
        System.out.println("Finding the target element is present in this string are not? ");
        String name = "Ayush Kumar";
        char target = 'K';
        System.out.println(name);
        System.out.println(name.toCharArray());
        System.out.println(Arrays.toString(name.toCharArray()));  // converting the string into arrays.

        System.out.println(search(name,target));
    }
    static boolean search(String str,char target){
        if(str.length() ==0 ){
            return false;
        }

//        for loop:
//        for(int i=0;i<str.length();i++){
//            if(target == str.charAt(i)){  //str.char(i) means take the character at one by one.
//                return true;
//            }
//        }

//        using for each loop
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
