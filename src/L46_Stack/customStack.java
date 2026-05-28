package L46_Stack;

public class customStack  {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public customStack(){
        this(DEFAULT_SIZE);
    }
    public customStack(int size){
        this.data = new int[size];
    }

    // push item:
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full!!");
            return false;
        }
        data[++ptr] = item;
        return true;
    }

    // pop item:
    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack!!");
        }
        return data[ptr--];
    }

    // peek():
    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot peek form an empty stack!!");
        }
        return data[ptr];
    }
    public boolean isFull(){
        return ptr == data.length-1;
    }
    public boolean isEmpty(){
        return ptr == -1;
    }
}
