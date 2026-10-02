package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Q8_Generate_Parentheses_22 {
    public void main() {
        int n = 3;
        System.out.println(generateParenthesis(n));
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        return combParenteses(n, 0, 0, ans, "");
    }
    public  List<String> combParenteses(int n, int open, int close, List<String> list, String st){

        if(open == n && close == n){
            list.add(st);
            return list;
        }

        if(open < n){
            combParenteses(n, open+1, close, list, st + "(" );
        }
        if(close < n && open > close){
            combParenteses(n, open, close+1, list, st + ")" );
        }

        return list;

    }
}
