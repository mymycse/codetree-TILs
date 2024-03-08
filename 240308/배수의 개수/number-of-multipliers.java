import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt_3 = 0, cnt_5 = 0;

        for ( int i = 1 ; i <= 10 ; i++ ) {

            int a = sc.nextInt();

            if ( a % 3 == 0 )
            cnt_3++;
            if ( a % 5 == 0 )
            cnt_5++;
        }

        System.out.print( cnt_3 + " " + cnt_5 );
    }
}