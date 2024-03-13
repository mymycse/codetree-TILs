import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while ( true ) {
            int a = sc.nextInt();
            
            if ( a == 999 || a == -999 )
            break;

            if ( a > max )
            max = a;

            if ( a < min )
            min = a;

        }

        System.out.printf("%d %d", max, min);
    }
}