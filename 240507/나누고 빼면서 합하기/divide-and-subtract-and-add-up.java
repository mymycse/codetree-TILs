import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;

        int[] arr = new int[n+1];
        for ( int i = 1 ; i < n+1 ; i++ )
            arr[i] = sc.nextInt();

        for ( ;; ) {
            cnt += arr[m];
            if ( m == 1 )
                break;
            if ( m % 2 == 0 ) 
                m /= 2;
            else 
                m--;
        }
        System.out.print(cnt);
    }
}