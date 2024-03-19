import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String A = sc.next();

        int a = A.length();
        int s = str.length();

        for ( int i = 0 ; i < a ; i++ ) {
            if ( A.charAt(i) == 'L' ) 
                str = str.substring(1) + str.charAt(0);
            else
                str = str.charAt(s-1) + str.substring(0,s-1);
        }
        System.out.print(str);
    }
}