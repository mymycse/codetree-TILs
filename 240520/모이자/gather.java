import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] map = new int[n];

        for ( int i = 0 ; i < n ; i++ )
            map[i] = sc.nextInt();

        int result = Integer.MAX_VALUE;

        for ( int i = 0 ; i < n ; i++ ) {
            int distance = 0;

            for ( int j = 0 ; j < n ; j++ ) {
                distance += map[j]*(Math.abs(i-j));
            }

            result = Math.min(result,distance);
        }

        System.out.println(result);
    }
}