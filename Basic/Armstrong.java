package Basic;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,arm = 0,rem;
        System.out.print("Enter any number!: ");
        n = sc.nextInt();
        int temp = n;
        while(n > 0){
            rem = n%10;
            arm = (rem*rem*rem)+arm;
            n /= 10;
        }
        if(temp==arm){
            System.out.println("ArmStrong");
        }
        else{
            System.out.println("No!");
        }
    }

}
