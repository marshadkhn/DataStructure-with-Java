package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any natural number: ");
        int input = sc.nextInt();
        System.out.println("Factorial of "+input+" is: "+factorial(input));
    }
    public static int factorial(int f) {
        if(f == 1){
            return 1;
        }
        return f * factorial(f-1);
    }
}
