import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = 0, num = 0;
        
        int[] arr = new int[n];
        int[] cnt = new int[1001];

        for ( int i = 0 ; i < n ; i++ ) {
            arr[i] = sc.nextInt();
            cnt[arr[i]]++;
            if ( arr[i] > max )
            max = arr[i];
        }
        for ( int j = max ; j >= 0 ; j-- ) {
            if ( cnt[j] == 0 || cnt[j] > 1 )
            continue;
            else {
                num++;
                max = j;
                break;
            }
        }
        if ( num > 0 )
        System.out.print(max);
        else
        System.out.print(-1);
    }
}