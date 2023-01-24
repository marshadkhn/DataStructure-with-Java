package Stack;

public class DynamicStack extends customStack{
    public DynamicStack() {
        super(); //Const.. without size
    }

    public DynamicStack(int size) {
        super(); //Const.. with size
    }

    @Override
    public int push(int item) {
        if(isFull()){
            int[] temp = new int[data.length * 2];  //increasing the size

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(item);
    }
}
