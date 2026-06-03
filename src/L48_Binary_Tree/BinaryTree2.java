package L48_Binary_Tree;

import java.util.Scanner;

public class BinaryTree2 {
    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }
    private Node root;

    public void populate(Scanner scanner){
        System.out.println("Enter the root Node: ");
        int value = scanner.nextInt();

        root = new Node(value); // creating the root node

        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node){

        System.out.println("Do you want to enter left of "+ node.value);
        boolean left = scanner.nextBoolean();

        if(left){
            System.out.println("Enter the value of the left of "+ node.value);
            int val= scanner.nextInt();

            node.left = new Node(val);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of "+ node.value);
        boolean right = scanner.nextBoolean();

        if(right){
            System.out.println("Enter the value of the right of "+ node.value );
            int val = scanner.nextInt();

            node.right = new Node(val);

            populate(scanner, node.right);
        }
    }

    //display

}
