package L22_Queue;

public class QueueMain {
    static void main() throws Exception {
//        CustomQueue queue = new CustomQueue(5);
        CircularQueue queue = new CircularQueue(5);
        queue.insert(4);
        queue.insert( 6);
        queue.insert(2);
        queue.insert(19);
        queue.insert(1);
//        queue.insert(1);

        queue.display();

        System.out.println(queue.removed());
        System.out.println(queue.removed());
        System.out.println(queue.removed());
        System.out.println(queue.removed());

        queue.display();
    }
}
