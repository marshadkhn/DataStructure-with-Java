package Sorting;

public class mergeSort {
    public static void mergeSortConquer(int[] arr, int mid, int si, int ei){
        int[] merged = new int[ei - si + 1];
        int ID1 = si;
        int ID2 = mid + 1;
        int x = 0;

        while(ID1 <= mid && ID2 <= ei){
            if(arr[ID1] <= arr[ID2]){
            merged[x++] = arr[ID1++];
            } else {
                merged[x++] = arr[ID2++];
            }
        }

        while(ID1 <= mid){
            merged[x++] = arr[ID1++];
        }

        while(ID2 <= ei){
            merged[x++] = arr[ID2++];
        }

        for(int i=0,j=si;i<merged.length;i++,j++){
            arr[j] = merged[i];
        }
    }
    public static void mergeSortDivide(int[] arr,int si,int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;
        mergeSortDivide(arr,si,mid);
        mergeSortDivide(arr,mid+1,ei);
        mergeSortConquer(arr,si,mid,ei);
    }
    public static void main(String[] args) {
        int[] arr = {1,0,7,4,2};
        int n = arr.length;
        mergeSortDivide(arr,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
