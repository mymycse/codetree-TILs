import java.util.Scanner;

public class Main {
    public static void div( int n, int m ) {

        int a = 0, b = 0;
        
        if ( n > m ) {
            a = n;
            b = m;
            }
        else {
            a = m;
            b = n;
        }

        for ( int i = b ; i > 0 ; i-- ) {
            if ( n % i == 0 && m % i == 0 ) {
                System.out.print(i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        div(n,m);
    }
}