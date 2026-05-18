package Arrays;
import java.util.Scanner;
import java.util.ArrayList;
//import java.util.jar.JarOutputStream;

public class Array_list {
    static void main() {
        Scanner input = new Scanner(System.in);
//        Syntax
        ArrayList<Integer> list=new ArrayList<>(5);
        list.add(39);
        list.add(65);
        list.add(25);
        list.add(85);
        list.add(23);
        list.add(97);
        list.add(26);  //add element
        System.out.println(list);
        System.out.println(list.contains(43));  //check the 43 is in the list or not
        list.set(0,99);   // update the element(index,value)
        System.out.println(list);
        list.remove(4);  //remove the element
        System.out.println(list);


        ArrayList<Integer> LIST = new ArrayList<>();
        System.out.println("Enter the element: ");
        for(int i=0;i<5;i++){
            LIST.add(input.nextInt());
        }
//        get the item at any index
        for(int i=0;i<5;i++){
            System.out.printf("%d \n",LIST.get(i)); // pass index here,list[index] syntax will not work here.
        }
        System.out.println(LIST);

//        -->Size is fixed internally
//        -->Say arraylist fill by some amount:-
//                         --> It will a new arraylist of say, double the size
//                         --> Old element are copied in new one
//                         --> Old one is deleted
//          [1,2,3,5] -->  [1,2,3,5,6,7,     ]
    }
}
