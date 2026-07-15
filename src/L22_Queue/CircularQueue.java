package L22_Queue;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = -1;
    protected int front = -1;
    protected int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }
    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    //insert
    public boolean insert(int item) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full!!");
        }
        if(front == -1){
            front = 0;
        }
        end = ( end + 1 ) % data.length;
        data[end] = item;
        size++;
        return true;
    }

    // removed
    public int removed() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty!!");
        }
        int removed = data[front];
        front = (front + 1) % data.length;
        size--;

        // reset when empty
        if(size == 0){
            front = -1;
            end = -1;
        }
        return removed;
    }

    //front
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty!!");
        }

        return data[front];
    }

    //display
    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty!!");
        }
        int i = front;
        for (int count = 0; count < size; count++) {
            System.out.print(data[i] + " -> ");
            i = (i + 1) % data.length;
        }
        System.out.println("END");
    }
}
