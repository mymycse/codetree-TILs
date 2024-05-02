import java.util.*;

public class Main {
    public static boolean palindrome(String str) {
        int n = str.length();

        for ( int i = 0 ; i < n ; i++ ) {
            if ( str.charAt(i) == str.charAt(n-i-1) )
                continue;
            else
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if ( palindrome(str) )
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}