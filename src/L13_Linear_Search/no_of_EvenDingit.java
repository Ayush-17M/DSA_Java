package L13_Linear_Search;

public class no_of_EvenDingit {
    public static void main() {
//        finding the no of number that have even no of digit.
        int[] arr = {18,124,4,1764,98,1};
        System.out.println("Number of even digit :"+digit(arr));
    }
    static int digit(int[] arr){
        int count = 0;
        for(int num : arr){
//            int digit = 0;
//            while(num > 0){
//                digit++;
//                num/=10;
//            };
//            if(digit % 2 == 0){
//                count++;
//            }

            if(even(num)){   //for call other module;
                count++;
            }
        }
        return count;
    }
    static boolean even(int n){  //method definition
        int digit =0;
        while(n>0){
            digit++;
            n/=10;
        }
        return digit % 2 == 0;  //this is shortcut of checking condition true or false
    }
}

