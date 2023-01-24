package Sorting;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("BUBBLE SORT");
        System.out.println(" ");
        System.out.println("Enter the number of elements");
        int n = in.nextInt();
        int[] array = new int[90];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("Your sorted array is:- ");
        BubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void BubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                    swap(arr,arr[j],arr[j-1]);
                }
            }
        }
       // return 0;
    }
//created a separated swap function
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
