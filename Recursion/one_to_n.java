package Recursion;

import java.util.Scanner;
public class one_to_n {
    public static void main(String[] args) {

        natural(5,1);
    }

    public static void natural(int y, int i){
        //Base condition
        if(i <= y){
            System.out.println("ARSHAD");
            i = i+1;
            natural(y,i);
        }
    }
}
