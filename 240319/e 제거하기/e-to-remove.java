import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int cnt = 0;

        for ( int i = 0 ; i < s.length() ; i++ ) {
            if ( s.charAt(i) == 'e' ) {
                cnt = i;
                break;
            }
        }

        System.out.print( s.substring(0,cnt) + s.substring(cnt+1) );
    }
}