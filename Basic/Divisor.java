package Basic;

public class Divisor {
    public static void main(String[] args) {
Dic(4);
    }
    public static void Dic(int n){
        System.out.println("The Divisor of "+n+" are");
        for (int i = 1; i <= n ; i++) {
            if(n%i == 0)
                System.out.print(i+" ");


        }
    }
}
