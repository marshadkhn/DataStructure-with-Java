//Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
//        Given an array, your task is to find the index of first Equilibrium point in the array.
package InterviewQuestions;

public class Equilibrium {
    public static void main(String[] args) {

    }
    public static int findEquilibrium(int arr[], int n)
    {
        int left,right;
        int i,j;
        for(i = 0; i < n; ++i)
        {
            left = 0;
            for(j = 0; j < i; j++) left += arr[j];
            right = 0;
            for(j = i + 1; j < n; j++) right += arr[j];
            if(left == right) return i;
        }
        return -1;
    }
}
