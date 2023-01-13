import java.util.Scanner;
public class PrimeFactorization {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for (int f=1; f<=n; f++){
            if (n%f==0){
               if (isPrime(f)){
                   System.out.print(f+" ");
                   n = n/f;
                   f=1;
               }
            }
        }
    }

    public static boolean isPrime(int n){
        if (n<2) return false;
        else if (n==2 || n==3) {
            return true;
        } else {
            for (int i=2; i<n; i++){
                if (n%i==0) return false;
            }
            return  true;
        }
    }
}
