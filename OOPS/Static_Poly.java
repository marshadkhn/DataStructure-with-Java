package OOPS;

public class Static_Poly {
    static public int sum(int a, int b){
        return a + b;
    }
    //Overloading SUM method
    static public int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        int a = sum(2,3);
        int z = sum(1,2,3);
        System.out.println(a);
        System.out.println(z);
    }
}
