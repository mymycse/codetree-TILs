import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] idx = new int[3];
        int cnt = 1;
        int last = 1;

        for ( int i = 0 ; i < n ; i++ ) {
            arr[i] = sc.nextInt();
            
            if ( i == 0 || arr[i] == arr[i-1] ) {
                cnt++;
            } else if ( arr[i] != arr[i-1] ) {
                if ( cnt > last )
                    last = cnt;
                cnt = 1;
            }
        }

        System.out.println(last);
    }
}