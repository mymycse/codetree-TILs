import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0, loc = 0;
        int[] arr = new int[n];

        for ( int i = 0 ; i < n ; i++ ) {
            arr[i] = sc.nextInt();
            if ( arr[i] == 2 ) 
            cnt++;
            if ( cnt == 3 ) {
                loc = i;
                break;
            }
        }
        System.out.print(loc+1);
    }
}