package Recursion;
public class RopeCutting {
    public static void main(String[] args) {
        int n = 10;
        int a = 2;
        int b = 5;
        int c = 7;
        int maxPieces = maxPiece(n, a, b, c);
        
        System.out.println(maxPieces);

    }
    public static int maxPiece(int n, int a, int b, int c) {
        if (n == 0) return 0;
        if (n < 0) return -1;
        int finalMax = Math.max(maxPiece(n-a, a, b, c),
                Math.max(maxPiece(n-b, a, b, c), maxPiece(n-c, a, b, c)));
        return finalMax;
    }
}
