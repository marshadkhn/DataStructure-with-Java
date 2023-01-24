package Queue;

public class customQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public customQueue(){
        this(DEFAULT_SIZE);
    }

    public customQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length; // ptr is at last index
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean Insert(int item)
    {
        if(isFull()){
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception{
        int remove = data[0];
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return remove;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");

        }
        return data[0];
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+ " | ");
        }
        System.out.println("END");
    }

}
