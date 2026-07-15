package L23_Binary_Tree.AVL_Tree;

public class Tree {
    static void main() {
        AVL_Tree tree = new AVL_Tree();
        for (int i = 0; i < 100; i++) {
            tree.insert(i);

        }

        tree.display();
    }
}
