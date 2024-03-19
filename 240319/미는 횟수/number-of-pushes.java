import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String str = sc.next();

        int n = s.length();
        int cnt = 0;

        for ( int i = 0 ; i < n ; i++ ) {
            if ( str.equals(s) )
                break;

            str = str.charAt(n-1) + str.substring(0,n-1);
            cnt++;
        }
        System.out.print(cnt);
    }
}