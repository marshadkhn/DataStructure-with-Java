package Array;
import java.util.Scanner;
public class deletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements you want in array");
        int input = sc.nextInt();
        
    }

    public static void removeElement(int[] arr, int element) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(element == arr[i]){
                for (int j = 0; j < n - 1; j++) {
                    arr[j] = arr[j+1];
                    break;
                }
            }
        }
        n = n - 1;
    }
}
