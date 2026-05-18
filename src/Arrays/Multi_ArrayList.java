package Arrays;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Multi_ArrayList {
    static void main() {
//        Multi_ArrayList:
        ArrayList<ArrayList<Integer>> list = new ArrayList();

        Scanner input = new Scanner(System.in);
//        initialisation
        for(int i=0;i<3;i++){
            list.add(new ArrayList());
        }
        for(int i=0;i<3;i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);  //but it not happen in array.
        System.out.println("size of ArrayList: "+list.toArray().length);

//        add elements
        System.out.println("Enter the element : ");
        for(int i=0;i<list.toArray().length;i++){
            for(int j=0;j<list.toArray().length;j++){
                System.out.printf("Enter the ArraysList of list[%d][%d] : ",i,j);
                list.get(i).add(input.nextInt());  //taking the input add the element in the list.
            }
            System.out.println();
        }
            System.out.println(list);
    }
}
