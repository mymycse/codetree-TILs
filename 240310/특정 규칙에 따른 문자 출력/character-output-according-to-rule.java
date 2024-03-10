import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        
        for ( int i = 1 ; i <= n ; i++ ) {
            for ( int j = 1 ; j <= n-i ; j++ ) {
                System.out.print( "  " );
                cnt++;
            }
            for ( int k = n - cnt ; k > 0 ; k-- ) {
                System.out.print( "@ " );
                cnt = 0;
            }
            System.out.println();
        }
    
        for ( int i = 1 ; i < n ; i++ ) {
            for ( int j = 1 ; j <= n-i ; j++ )
                System.out.print( "@ " );
            System.out.println();
        }
    }
}