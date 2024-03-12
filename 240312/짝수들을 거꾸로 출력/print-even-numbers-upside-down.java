import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        int[] arr = new int[n];

        for ( int i = 0 ; i < n ; i++ ) {
            int a = sc.nextInt();
            if ( a % 2 == 0 ) {
                arr[cnt] = a;
                cnt++;
            }
        }
        for ( int j = cnt ; j > 0 ; j-- )
        System.out.print(arr[j-1] + " ");
    }
}