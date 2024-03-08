import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, n = 0;

        for ( int i = 1 ; i <= 10 ; i++ ) {

            int a = sc.nextInt();

            if ( a >= 0 && a <= 200 ) {
                sum += a;
                n++;
            }
        }

        System.out.printf( "%d %.1f", sum, (double)sum/n);
    }
}