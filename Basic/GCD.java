package Basic;

public class GCD {
    public static void main(String[] args) {
        System.out.println(GCD(3,6));
    }
    public static int GCD(int x, int y){
        int ans = 1;
        for (int i = 1; i <= Math.min(x,y); i++) {
if(x % i == 0 && y % i == 0)
{
 ans = i;
}
        }
        return ans;
    }
}
