package InterviewQuestions;

class Pair{
    int min;
    int max;
}
public class minMaxArray {
    public static Pair getMinMax(int arr[], int n)
    {
    Pair minMax = new Pair();
    int i;

    //When array has only one element
        if(n == 1){
            minMax.max = arr[0];
            minMax.min = arr[0];
        }

    //When array has two elements
    if(arr[0] > arr[1])
    {
        minMax.max = arr[0];
        minMax.min = arr[1];
    }
    else
    {
    minMax.max = arr[1];
    minMax.min = arr[0];
    }

    //When array is long
        for ( i = 2; i < n; i++)
        {
        if(arr[i] > minMax.max){
        minMax.max = arr[i];
        }
        else if(arr[i]< minMax.min){
            minMax.min = arr[i];
        }
        }
        return minMax;
    }
    public static void main(String[] args) {
        int arr[] = {10,-1,12,56,345};
        int size = 5;
        Pair minMax = getMinMax(arr, size);
        System.out.printf("\nMinimum element is %d", minMax.min);
        System.out.printf("\nMaximum element is %d", minMax.max);

    }
}
