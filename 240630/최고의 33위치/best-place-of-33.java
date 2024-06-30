import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] coin = new int[n][n];

        for ( int i = 0 ; i < n ; i++ )
            for ( int j = 0 ; j < n ; j++ )
                coin[i][j] = sc.nextInt();
        
        int result = 0;

        for ( int i = 0 ; i < n-2 ; i++ )
            for ( int j = 0 ; j < n-2 ; j++ ) {
                int sum = 0;

                for ( int row = i ; row < i+3 ; row++ )
                    for ( int col = j ; col < j+3 ; col++ )
                        sum += coin[row][col];
                
                result = Math.max(result,sum);
            }

        System.out.println(result);
    }
}