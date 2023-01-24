package Sorting;

public class quickSort {
public static void swap(int first,int second){
    int temp = first;
    first = second;
    second = temp;
}
    //partitioning
    public static int partition(int[] arr,int low,int high) {
        int pivot = arr[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if(arr[j] <= pivot){
                int temp =arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                //swap(arr[i],arr[j]);
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        //swap(arr[i],arr[high]);
        return i;
    }

    //main function
    public static void quickSort(int[] arr, int low, int high){
     if(low < high){
    int pivotIndex = partition(arr, low, high);

    quickSort(arr,low,pivotIndex - 1);
    quickSort(arr,pivotIndex + 1,high);
}
    }
    public static void main(String[] args) {
     int[] arr = {3,2,7,8,1,9};
     int n = arr.length;
     quickSort(arr,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
