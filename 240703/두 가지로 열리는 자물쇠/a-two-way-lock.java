import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] loc = new int[6];

        for ( int i = 0 ; i < 6 ; i++ )
            loc[i] = sc.nextInt();

        int cnt = 0;

        for ( int a = 1 ; a <= n ; a++ )
            for ( int b = 1 ; b <= n ; b++ )
                for ( int c = 1 ; c <= n ; c++ ) {
                    boolean locker = false;
                    for ( int i = 0 ; i < 2 ; i++ ) {
                        int num1 = Math.abs(a-loc[i*3]);
                        int num2 = Math.abs(b-loc[1+i*3]);
                        int num3 = Math.abs(c-loc[2+i*3]);

                        locker = (num1 <= 2 || num1 >= n-2) && (num2 <= 2 || num2 >= n-2) && (num3 <= 2 || num3 >= n-2);

                        if ( locker ) {
                            cnt++;
                            break;
                        }
                    }
                }

        System.out.println(cnt);
    }
}