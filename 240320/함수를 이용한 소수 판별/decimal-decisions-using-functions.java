import java.util.Scanner;

public class Main {
    public static boolean isPrime( int n ) {
        for ( int i = 2 ; i < n ; i++ )
            if ( n % i == 0 )
                return false;
        
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;

        if ( a == 1 && b == 1 ) {}
        else {
        for ( int i = a ; i <= b ; i++ ) {
            if ( isPrime(i) )
                sum += i;
        }}
        System.out.print(sum);
    }
}