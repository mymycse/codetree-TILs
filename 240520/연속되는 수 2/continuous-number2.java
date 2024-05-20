import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] idx = new int[3];

        for ( int i = 0 ; i < n ; i++ ) {
            arr[i] = sc.nextInt();
            if ( i == 0 || arr[i] != arr[i-1] ) {
                idx[0] = idx[1];
                idx[1] = i;
            }

            if ( idx[1]-idx[0] > idx[2] )
                idx[2] = idx[1]-idx[0];
        }

        System.out.println(idx[2]);
    }
}