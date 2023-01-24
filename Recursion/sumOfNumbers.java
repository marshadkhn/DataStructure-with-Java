package Recursion;

import java.util.Scanner;

public class sumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int input = sc.nextInt();
        System.out.println("Sum of "+input+" natural numbers is: "+sum(input));
    }
    public static int sum(int f) {
        if(f == 1){
            return 1;
        }
        return f + sum(f-1);
    }
}
