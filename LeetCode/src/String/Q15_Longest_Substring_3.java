package String;

import java.util.HashSet;

//3. Longest Substring Without Repeating Characters

public class Q15_Longest_Substring_3 {

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);

            while(set.contains(ch)){
                set.remove(s.charAt(left++));
            }

            set.add(ch);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
