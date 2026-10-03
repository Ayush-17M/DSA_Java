package String;

public class Q14_Longest_Valid_Parentheses_32 {

    public int longestValidParentheses(String s) {
        int n = s.length();
        int open = 0;
        int close = 0;

        int result = 0;
// Left to right
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '('){
                open++;
            }else{
                close++;
            }

            if(open == close){ // left to right
                result = Math.max(result, open + close);
            }
            else if(close > open){
                open = 0;
                close = 0;
            }
        }

// Right to Left
        open = 0;
        close = 0;

        for(int j = n-1; j >= 0; j--){
            if(s.charAt(j) == '('){
                open++;
            }else{
                close++;
            }

            if(open == close){  // right to left
                result = Math.max(result, open + close);
            }
            else if(close < open){
                open = 0;
                close = 0;
            }
        }

        return result;
    }

}
