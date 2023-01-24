package Searching;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("BINARY SEARCH");
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
        int ans = BinarySearch(array,target);
        System.out.println(ans);
    }
    public static int BinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1 ;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
