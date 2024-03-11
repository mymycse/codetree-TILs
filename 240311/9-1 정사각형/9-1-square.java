import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 9;

        for ( int i = 0 ; i < n ; i++ ) {
            for ( int j = 0 ; j < n ; j++ ) {
                if ( a == 0 )
                a = 9;
                System.out.print(a);
                a--;
            }
            System.out.println();
        }
    }
}