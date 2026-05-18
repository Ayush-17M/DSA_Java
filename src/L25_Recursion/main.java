package L25_Recursion;

public class main {
// find the fibonacci number.
//    0,1,1,2,3,5,8
     static void main() {
         System.out.println(fibo(4));
    }

    static int fibo(int n){
//         base condition
        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
