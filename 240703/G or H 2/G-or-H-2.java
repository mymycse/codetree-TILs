import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] pic = new int[101];

        for ( int i = 0 ; i < n ; i++ ) {
            int map = sc.nextInt();
            char c = sc.next().charAt(0);

            if ( c == 'G' )
                pic[map] = 1;
            else
                pic[map] = 2;
        }

        int result = 0;

        for ( int i = 0 ; i <= 100 ; i++ )
            for ( int j = i+1 ; j <= 100 ; j++ ) {

                if ( pic[i] == 0 || pic[j] == 0 )
                    continue;

                int g = 0;
                int h = 0;

                for ( int a = i ; a <= j ; a++ ) {
                    if ( pic[a] == 1 )
                        g++;
                    else if ( pic[a] == 2 )
                        h++;
                }

                if ( g == 0 || h == 0 || g == h )
                    result = Math.max(result, j-i);
            }
        
        System.out.println(result);
    }
}