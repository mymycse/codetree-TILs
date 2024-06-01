import java.util.Scanner;

public class Main {
    public static int GCD( int a, int b ) {
        if ( a%b == 0 )
            return b;
        return GCD(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = sc.nextInt();

        while ( n-- > 1 ) {
            int k = sc.nextInt();
            int gcd = GCD(answer,k);
            answer = answer*k/gcd;
        }

        System.out.println(answer);
    }
}