import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mid = new int[n];

        for ( int i = 0 ; i < n ; i++ ) {
            mid[0] = sc.nextInt();
            Arrays.sort(mid);

            if ( i%2 == 0 ) {
                System.out.print( mid[n-1-(i+1)/2] + " " );
            }
        }
    }
}