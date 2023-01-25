package Recursion;
import java.util.Scanner;
public class PrintNto1 {
    public static void main(String[] args){
      int n = new Scanner(System.in).nextInt();
      printNto1(n);
    }
    public static void printNto1(int n){
        if (n==0) return;
        System.out.print(n+" ");
        printNto1(--n);
    }
}
