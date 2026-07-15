package L20_Linked_List;

public class CLL {
    private Node head;
    private Node tail;

    public void insert (int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void delete(int val){
        Node temp = head;

        if(temp == null){
            System.out.println("Node is not available");
            return;
        }
        if(head.val == val){
            head = head.next;
            tail = head;
        }
        do{
            Node n = temp.next;
            if(n.val == val){
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        }while (temp != head);
    }

    public void display(){
        Node temp = head;
        if(temp == null){
            System.out.println("node is not available");
            return;
        }
        do{
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        } while(temp != head);
        System.out.println("HEAD");
    }


    private class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
}
