import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        for ( int i = 0 ; i < n ; i++ ) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        int cnt = 0;

        for ( int i = 1 ; i <= 9 ; i++ )
            for ( int j = 1 ; j <= 9 ; j++ )
                for ( int k = 1 ; k <= 9 ; k++ ) {

                    if ( i == j || j == k || k == i )
                        continue;

                    boolean checked = true;
                    for ( int q = 0 ; q < n ; q++ ) {
                        int x = a[q] / 100;
                        int y = a[q] / 10 % 10;
                        int z = a[q] % 10;

                        int cnt1 = 0, cnt2 = 0;

                        if ( x == i )   cnt1++;
                        if ( y == j )   cnt1++;
                        if ( z == k )   cnt1++;
                        
                        if ( x == j || x == k ) cnt2++;
                        if ( y == i || y == k ) cnt2++;
                        if ( z == i || z == j ) cnt2++;

                        if ( cnt1 != b[q] || cnt2 != c[q] ) {
                            checked = false;
                            break;
                        }
                    }
                    
                    if ( checked )  cnt++;
                }

        System.out.println(cnt);
    }
}