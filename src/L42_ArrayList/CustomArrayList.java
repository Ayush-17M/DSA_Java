package L42_ArrayList;

import java.util.Arrays;
import java.util.ArrayList;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;  // size is also working as a index value

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }
    // add
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }
    // check arr is full or not
    private boolean isFull(){
        return size == data.length;
    }
    // resize the array
    private void resize(){
        int[] temp = new int[data.length * 2];

        //copy the current items in the new array
        for(int i=0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    //remove
    public int remove(){
        int removed = data[--size];
        return removed;
    }
    //get
    public int get(int index){
        return data[index];
    }
    //size
    public int size(){
        return size;
    }
    //set
    public void set(int index, int value){
        data[index] = value;
    }
    //toString
    public String toString(){
        return "CustomArrayList{"+
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                "}";
    }
    static void main() {
//        ArrayList list = new ArrayList<>();
        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        System.out.println(list);

        for(int i = 0; i < 14; i++){
            list.add(2*i);
        }
        System.out.println(list);
    }
}
