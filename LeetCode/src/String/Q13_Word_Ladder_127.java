package String;
import java.util.*;

public class Q13_Word_Ladder_127 {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)){
            return 0;
        }

        Set<String> word = new HashSet<>(wordList);
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);

        int length = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            length++;

            for(int i = 0; i < size; i++){  // loop run 1 times
                String current = queue.poll();

                for(int j = 0; j < current.length(); j++){ // loop run 3 times
                    char[] temp = current.toCharArray(); // split the string into char

                    for(char ch = 'a'; ch <= 'z'; ch++){ // loop run 26 times
                        temp[j] = ch;

                        String newWord = new String(temp);
                        if(endWord.equals(newWord)){
                            return length+1;
                        }

                        if(word.contains(newWord)){
                            queue.offer(newWord); // newWord add in queue
                            word.remove(newWord);
                        }
                    }
                }
            }
        }

        return 0;
    }

}
