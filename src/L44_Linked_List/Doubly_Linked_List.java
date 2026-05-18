package L44_Linked_List;

public class Doubly_Linked_List {
    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        node.next = null;
        node.prev = null;

        if(head == null){
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        node.prev = temp;
        temp.next = node;
    }

    public void  insert(int after, int val){
        Node node = new Node(val);

        Node temp = head;
        while (temp != null){
            if(temp.val == after){
                break;
            }
            else if(temp.next == null){
                System.out.println("Does not exist");
                return;
            }
            temp = temp.next;
        }
        node.next = temp.next;
        node.prev = temp;
        temp.next = node;
        if(node.next != null){
            node.next.prev = node;
        }
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("end");

        System.out.println("Print in reverse");
        while(last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("Start");
    }

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }

    }
}
