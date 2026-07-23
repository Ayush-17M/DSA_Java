package Arrays;
import java.util.*;

public class Q35_Pascal_Triangle_118 {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>(); // final ans
        List<Integer> list = new ArrayList<>(); // add first list [1]
        list.add(1);
        result.add(list);

        if(numRows == 1){
            return result;
        }

        // nuwRow > 1
        for(int i = 0; i < numRows-1; i++){
            List<Integer> prev = result.get(i); // get previous list

            List<Integer> newList = new ArrayList<>();
            newList.add(1); // new list which are start with 1

            for(int j = 0; j < i; j++){
                newList.add(prev.get(j) + prev.get(j + 1)); // add the previous ele.
            }

            newList.add(1); // end with 1

            result.add(newList);
        }

        return result;
    }
}
