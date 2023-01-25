package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        if (n==0||n==1) return 1;
        return n*factorial(n-1);
    }
}
