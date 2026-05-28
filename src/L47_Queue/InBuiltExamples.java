package L47_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InBuiltExamples {
    static void main() {
        // Queue is interface:
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(1);
        queue.add(7);
        queue.add(9);

        System.out.println("Top element: "+queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
