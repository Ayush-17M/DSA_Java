package L15_OOPs.access;

public class A {
    private int num;  // Only access in this class (we do not access outside the class).
    private String name; // Only access in this package and different package subClass (We do not access different package and not subClass).
    int[] arr;

    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }

    public A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
