import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        int[] arr = new int[11];

        while ( true ) {
            a = a/b;
            arr[a%b]++;
            if ( a <= 1 )
            break;
        }
        
        for ( int i = 0 ; i < 10 ; i++ ) {
            sum += arr[i] * arr[i];
        }

        System.out.print(sum);
    }
}