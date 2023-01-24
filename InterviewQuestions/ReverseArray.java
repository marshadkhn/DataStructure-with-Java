package InterviewQuestions;

public class ReverseArray {

    public static void Reverse(int arr[], int start, int end)
    {
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    }
    public static void printArray(int arr[], int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i]+ "");
        System.out.println(" ");
    }
    public static void main(String[] args)
    {
        int arr[] = {9,2,4,5,7,5};
        printArray(arr,6);
        Reverse(arr,0,5);
        System.out.println("Reversed array");
        printArray(arr,6);
    }
}

