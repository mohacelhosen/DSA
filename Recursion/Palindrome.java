package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abba";
        System.out.println(isPalindrome(str,0,str.length()-1));

    }
    public static boolean isPalindrome(String str, int s, int e){
        if (str.charAt(s)!=str.charAt(e)) return false;
        if (s>=e) return true;
        return isPalindrome(str, s+1, e-1);
    }
}
