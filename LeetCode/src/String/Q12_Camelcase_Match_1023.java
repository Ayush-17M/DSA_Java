package String;

import java.util.ArrayList;
import java.util.List;

public class Q12_Camelcase_Match_1023 {
    public List<Boolean> camelMatch(String[] queries, String pattern){

        List<Boolean> list = new ArrayList<>();

        for(String str : queries){
            list.add(isMatch(str, pattern));
        }
        return list;
    }
    public Boolean isMatch(String str, String pattern){
        int i = 0;
        int j = 0;

        while(i < str.length()) {
            if ( j < pattern.length() && str.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } else if (Character.isLowerCase(str.charAt(i))) {
                i++;
            } else {
                return false;
            }
        }
        return j == pattern.length();
    }

    public void main() {
        String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        String pattern = "FB";
        System.out.println(camelMatch(queries, pattern));
    }
}
