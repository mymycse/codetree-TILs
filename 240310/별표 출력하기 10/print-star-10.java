import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for ( int i = 0 ;  i < n*2 ; i++) {
            if ( i % 2 == 1 ) {
                for ( int j = 1 ; j <= n - (i - 1)/2 ; j++ )
                System.out.print("* ");
            }
            else {
                for ( int k = 1 ; k <= 1 + (i / 2) ; k++ )
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}