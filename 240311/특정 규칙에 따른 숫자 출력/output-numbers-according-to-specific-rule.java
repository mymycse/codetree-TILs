import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 1;

        for ( int i = 0 ; i < n ; i++ ) {
            for ( int j = 0 ; j < n ; j++ ) {
                if ( cnt == 10 )
                cnt = 1;
                if ( i > j ) {
                    System.out.print("  ");
                }
                else {
                    System.out.print(cnt + " ");
                    cnt++;
                }
            }
            System.out.println();
        }
    }
}