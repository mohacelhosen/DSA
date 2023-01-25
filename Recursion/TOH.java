package Recursion;

public class TOH {
    public static void main(String[] args) {
        towerOfHanoi(2,'A','B','C');
    }
    public static void towerOfHanoi(int n, char A, char B, char C){
        if (n==1){
            System.out.println("Move 1 from "+A+" to "+C);
            return;
        }
        towerOfHanoi(n-1,A,C,B);
        System.out.println("Move "+n+" from "+A+" to "+C);
        towerOfHanoi(n-1,B,A,C);
    }
}
