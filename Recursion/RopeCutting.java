package Recursion;

public class RopeCutting {
    public static void main(String[] args) {
        int n = 5;
        int a = 3;
        int b = 2;
        int c = 1;
        System.out.println(maxPiece(n,a,b,c));

    }
    public static int maxPiece(int n, int a, int b, int c){
        if (n==0) return 0;
        if (n<0) return -1;
        int tempMax = Math.max(maxPiece(n-a,a,b,c), maxPiece(n-b,a,b,c));
        int finalMax = Math.max(tempMax, maxPiece(n-c,a,b,c));
//        int max = (maxPiece(n-a,a,b,c) > maxPiece(n-b,a,b,c)) ? ((maxPiece(n-a,a,b,c)>maxPiece(n-c,a,b,c))? (maxPiece(n-a,a,b,c): maxPiece(n-c,a,b,c))) : ((maxPiece(n-b,a,b,c)>maxPiece(n-c,a,b,c))? (maxPiece(n-b,a,b,c):maxPiece(n-c,a,b,c));
        return finalMax;
    }
}
