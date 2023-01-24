package Stack;

public class StackMain {
    public static void main(String[] args) throws Exception {
        customStack Stack = new DynamicStack(2);
        System.out.println(Stack.push(2));
        System.out.println(Stack.push(3));
        System.out.println(Stack.push(5));


    }


}
