package L44_Linked_List;

import java.security.PrivateKey;

public class Single_LinkedList {

    private Node head;
    private Node tail;
    private int size;
    public Single_LinkedList(){
        this.size = 0;
    }

    // creating the node
    private class Node{
        private int value;
        private Node next;

        //constructure
        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
    // Inserting the node at first
    public void insertFirst(int val){
        Node newNode = new Node(val); // constructure are creating the node.
//        node.value = val;
        newNode.next = head;  // link the newNode into node.
        head = newNode; // Ponting the newNode is head

        if(tail == null){
            tail = head;
        }
        size += 1;

    }
    // Insert the node at end
    public void insetLast(int val){
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
            tail = head;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size += 1;
    }
    //Insert the node at particular index
    public void insert(int index, int val){
        // adding the node at first position
        if(index == 0){
            insertFirst(val);
            return;
        }
        // adding the node at last positon
        if(index == size){
            insetLast(val);
            return;
        }

        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node newNode = new Node(val, temp.next);
//        newNode.next = temp.next;
        temp.next = newNode;

        size++;
    }
    // Display the list
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+ " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
