import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        int[] arr = new int[n];
        int minVal = Integer.MAX_VALUE;

        for ( int i = 0 ; i < n ; i++ ) {
            arr[i] = sc.nextInt();
            if ( arr[i] < minVal ) 
                minVal = arr[i];
        }
        for ( int i = 0 ; i < n ; i++ ) {
            if ( arr[i] == minVal )
            cnt++;
        }
        System.out.printf("%d %d", minVal, cnt);
    }
}