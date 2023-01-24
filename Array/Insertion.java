package Array;
//import java.util.Arrays;
public class Insertion {
    public static void main(String[] args)
    {
        int[] arr = {1,2,4,5,6};
        int pos = 3, element = 3, n = arr.length;
        int newArr[] = new int[n+1];
        for(int i = 0; i<n; i++) {
            newArr[i] = arr[i];
        }
        for (int i = n; i > pos - 1; i--) {
            newArr[i] = newArr[i - 1];
        }
        newArr[pos - 1] = element;
        for (int i = 0; i < n + 1; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
