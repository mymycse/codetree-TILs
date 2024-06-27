import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] map = new int[101];
        int result = 0;

        for ( int i = 0 ; i < n ; i++ ) {
            int candy = sc.nextInt();
            int basket = sc.nextInt();
            map[basket] += candy;
        }

        for ( int i = 1 ; i <= 100 ; i++ )
            map[i] += map[i-1];

        if ( k >= 50 )
            result = map[100];
        else
            for ( int i = k+1 ; i <= 100-k ; i++ ) {
                int sum = map[i+k]-map[i-k-1];
                result = Math.max(sum,result);
            }

        System.out.println(result);
    }
}