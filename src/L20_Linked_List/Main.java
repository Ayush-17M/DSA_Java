package L20_Linked_List;

public class Main {
    static void main() {
//        // Add the node at first position. --> list1.insetFirst() method call
        Single_LinkedList list1 = new Single_LinkedList();
        list1.insertFirst(1);
        list1.insertFirst(2);
        list1.insertFirst(3);
        list1.insertFirst(4);

        list1.insertRec(20,3);

        list1.display();

//        // Add the node at last position. --> list1.insetLast() method call
        Single_LinkedList list2 = new Single_LinkedList();
        list2.insetLast(1);
        list2.insetLast(2);
        list2.insetLast(3);
        list2.insetLast(4);

        list2.display();

        list2.insert(2,5);

        list2.insert(0,9);
        list2.insetLast(6);
        list2.insert(3,8);
        list2.insert(5,7);
        list2.insetLast(3);
        list2.insert(3,0);

        list2.display();

//        Doubly_Linked_List list = new Doubly_Linked_List();
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertLast(5);
//        list.insertLast(6);
//        list.insertLast(7);
//        list.insert(6, 3);
//        list.display();
//
//        list.insert(10 , 1);

//        CLL list = new CLL();
//        list.insert(10);
//        list.insert(20);
//        list.insert(40);
//        list.insert(50);
//        list.insert(60);
//        list.insert(70);
//
//        list.display();
//        list.delete(50);
//        list.display();
    }
}
