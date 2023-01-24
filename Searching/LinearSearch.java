package Searching;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("LINEAR SEARCH");
        System.out.println("-1 is when your element is not present");
        System.out.println(" ");
        System.out.println("Enter the number of elements");
        int n = in.nextInt();
        int[] array = new int[50];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("Enter the element you want to search");
        int target = in.nextInt();
        int ans = LinearSearch(array,target);
        System.out.println(ans);
    }
    public static int LinearSearch(int[] arr, int target){
        if(arr.length == 0){
            System.out.println("NOT present");
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target) {
                return index;
            }
        }
        return -1;
    }
}
