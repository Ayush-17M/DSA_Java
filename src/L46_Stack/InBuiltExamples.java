package L46_Stack;
import java.util.Stack;

public class InBuiltExamples {
    static void main() {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(6);
        stack.push(29);
        stack.push(11);
        stack.push(24);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
