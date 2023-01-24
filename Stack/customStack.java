package Stack;

public class customStack
{
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    public customStack() {
        this(DEFAULT_SIZE);
    }
    public customStack(int size) {
        this.data = new int[size];
    }

    //Insertion
    public int push(int item){
        if(isFull()){
            System.out.println("Stack is full!");
            return 0;
        }
        ptr++;
        data[ptr] = item;
        return item;
    }

    public int peek() throws stackException{
        if(isEmpty()){
            throw new stackException("Cannot peek");
        }
        return data[ptr];
    }
    public boolean isFull() {
        return ptr == data.length - 1;  //If ptr is at last index
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("STACK IS EMPTY");
        }
        return data[ptr--];
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

}
