package L46_Stack;

public class StackMain {
    static void main() throws StackException {
        customStack stack = new customStack(5);
            stack.push(20);
            stack.push(50);
            stack.push(30);
            stack.push(60);
            stack.push(52);
            stack.push(2);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
