import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for ( int i = 1 ; i <= n ; i++ ) {
            int a = i*2;
            for ( int j = 0 ; j < n ; j++ ) {
                if ( a > 8  ) {
                    a = 2;
                }
                System.out.print(a + " ");
                a += 2;
            }
            System.out.println();
        }
    }
}