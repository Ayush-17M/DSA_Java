package L22_Queue;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = -1;
    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int Size){
        this.data = new int[Size];
    }

    public boolean isFull(){
        return end == data.length-1;
    }

    public boolean isEmpty(){
        return end == -1;
    }

    //insert()
    public boolean insert(int item){
        if(isFull()){
            System.out.println("Queue is full");
            return false;
        }
        data[++end] = item;
        return true;
    }

    // remove
    public int removed() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removeItem = data[0];
        for(int i = 0; i < end; i++){
            data[i] = data[i+1];
        }
        end--;
        return removeItem;
    }

    // front
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    // display
    public void display(){
        for(int i = 0; i <= end; i++){
            System.out.print(data[i] +" <- ");
        }
        System.out.println("END");
    }
}
