import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a=1, div = n;

        for ( int i = 1 ; i <= n ; i++ ) {
            div /= i;
            if ( div >= 1 ) {
                a++;
                continue;
            }
            else
            System.out.print(a);
            break;
        }
    }
}