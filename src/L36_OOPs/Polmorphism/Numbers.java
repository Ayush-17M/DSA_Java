package L36_OOPs.Polmorphism;

public class Numbers {

    void sum (int a, int b){
        System.out.println(a+b);
    }
    void sum (int a, int b, int c){
        System.out.println(a+b+c);
    }

    static void main() {
        Numbers obj = new Numbers();
        System.out.println("Method overloading: ");
        obj.sum(2, 3);
        obj.sum(2, 5, 6);
    }
}
