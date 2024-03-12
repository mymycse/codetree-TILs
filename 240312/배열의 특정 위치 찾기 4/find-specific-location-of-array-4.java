import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, cnt = 0;

        for ( int i = 0 ; i < 10 ; i++ ) {
            int a = sc.nextInt();
            if ( a == 0 )
            break;
            if ( a % 2 == 0 ) {
                sum += a;
                cnt++;
            }
        }
        System.out.printf("%d %d", cnt, sum);
    }
}