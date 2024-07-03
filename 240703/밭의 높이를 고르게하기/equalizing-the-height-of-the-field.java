import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();

        int[] farm = new int[n];

        for ( int i = 0 ; i < n ; i++ ) {
            int k = sc.nextInt();
            farm[i] = Math.abs(k-h);
        }

        Arrays.sort(farm);

        int cost = 0;

        for ( int i = 0 ; i < m ; i++ )
            cost += farm[i];

        System.out.println(cost);
    }
}