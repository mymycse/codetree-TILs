import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        int[] room = new int[n];
        for ( int i = 0 ; i < n ; i++ )
            room[i] = sc.nextInt();

        for ( int i = 0 ; i < n ; i++ ) {
            int sum = 0;
            for ( int j = 0 ; j < n ; j++ )
                sum += room[(i+j)%n]*j;

            ans = Math.min(ans,sum);
        }

        System.out.println(ans);
    }
}