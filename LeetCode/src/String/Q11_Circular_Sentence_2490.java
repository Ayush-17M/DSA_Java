package String;

import java.util.Arrays;

public class Q11_Circular_Sentence_2490 {

    public static boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length-1; i++) {
            if(words[i].charAt(words[i].length()-1) != words[i+1].charAt(0) ){
                return false;
            }
        }

        int n = words.length-1;
        if(words[0].charAt(0) != words[n].charAt(words[n].length()-1)){
            return false;
        }

        return true;
    }

    public static void main() {
        String sentence = "leetcode exercises sound delightful";
        boolean ans = isCircularSentence(sentence);

        System.out.println(ans);
    }
}
