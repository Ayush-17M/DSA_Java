package L4_BinarySearch;

public class Q3_smallestLetter_744 {
    static void main() {
//        Find the smallest letter greater than target
//        leetCode-744
        char[] letter = {'c','f','j'};
        char target = 'c';
        System.out.println(GreatestLetter(letter,target));
    }
    static char GreatestLetter(char[] letters, char target){
        int start = 0, end = letters.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
           if(target < letters[mid]){
               end = mid-1;
           }
           else{
               start = mid+1;
           }
        }
        return letters[start % letters.length];
    }
}
