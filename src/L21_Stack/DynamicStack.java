package L21_Stack;

public class DynamicStack extends customStack{
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }

    public boolean push(int item) {

        // this takes care of it being full
        if(this.isFull()){
            // double the array size
            int[] temp = new int[data.length * 2];

            for (int i = 0; i < data.length-1; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        // at this point we know that array is not full.
        // insert item
        return super.push(item);
    }
}
