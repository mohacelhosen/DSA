package Recursion;
import java.util.Scanner;
public class Print1ton {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        print1_N(n);
    }
    public static void print1_N(int n){
        if (n==0) return;
        print1_N(n-1);
        System.out.print(n+" ");
    }
}
