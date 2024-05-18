import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1000;
        int cnt = 0;
        int[] map = new int[2001];

        while( n-- > 0 ) {
            int a = sc.nextInt();
            char b = sc.next().charAt(0);

            for ( int i = x ; i < x+a ; i++ ) {
                if ( b == 'R' )
                    map[i]++;
                else
                    map[i]++;
            }
        }

        Arrays.sort(map);

        for ( int i = 2000 ; i >= 0 ; i-- ){
            if ( map[i] <= 1 )
                break;
            cnt++;
        }

        System.out.println(cnt);
    }
}