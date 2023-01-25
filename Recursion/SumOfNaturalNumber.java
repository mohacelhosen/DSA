package Recursion;
import java.util.Scanner;
public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int n= new Scanner(System.in).nextInt();
        System.out.println(sumOfN(n));
    }
    public static int sumOfN(int n){
        if (n==0) return 0;
        return n+sumOfN(n-1);
    }
}
