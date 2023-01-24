//Given an array of size N and you have to tell whether the array is perfect or not.
//An array is said to be perfect if it's reverse array matches the original array.
//If the array is perfect then print "PERFECT" else print "NOT PERFECT".

package InterviewQuestions.Arrays;

public class perfectArray
{
    public static void main(String[] args)
    {

    }
    public boolean IsPerfect(int a[], int n)
    {
        for(int i = 0; i < n;i++){
            if(a[i] != a[n - i -1]) return false;
        }
        return true;
    }
}
