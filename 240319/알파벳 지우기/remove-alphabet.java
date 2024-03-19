import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        String a = "";
        String b = "";

        for ( int i = 0 ; i < str1.length() ; i++ ) {
            char x = str1.charAt(i);
            if ( '0' <= x && x <= '9' )
                a += str1.charAt(i);
        }

        for ( int i = 0 ; i < str2.length() ; i++ ) {
            char x = str2.charAt(i);
            if ( '0' <= x && x <= '9' )
                b += str2.charAt(i);
        }

        int A = Integer.parseInt(a);
        int B = Integer.parseInt(b);

        System.out.print(A+B);
    }
}