import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = str.length();

        int cnt = 0;

        for ( int i = 0 ; i < n-1 ; i++ ) 
            if ( str.charAt(i) == 'e' && str.charAt(i+1) == 'e' )
                cnt++;
        
        System.out.print( cnt + " " );

        cnt = 0;

        for ( int i = 0 ; i < n-1 ; i++ ) 
            if ( str.charAt(i) == 'e' && str.charAt(i+1) == 'b' )
                cnt++;
        
        System.out.print( cnt );
    }
}