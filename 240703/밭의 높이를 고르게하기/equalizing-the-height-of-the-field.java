import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h = sc.nextInt();
        int t = sc.nextInt();

        int[] farm = new int[n];

        for ( int i = 0 ; i < n ; i++ ) {
            int k = sc.nextInt();
            farm[i] = Math.abs(k-h);
        }

        int cost = Integer.MAX_VALUE;

        for ( int i = 0 ; i <= n-t ; i++ ) {
            int sum = 0;
            
            for ( int j = i ; j < i+t ; j++ )
                sum += farm[j];

            cost = Math.min(cost,sum);
        }

        System.out.println(cost);
    }
}