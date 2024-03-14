import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 10000;
        int min = 0;
        int upsize, downsize;

        for ( int i = 0 ; i < 10 ; i++ ) {
            int a = sc.nextInt();
            if ( a > 500 ) {
                if ( a < max )
                max = a;
            }
            else {
                if ( a > min ) {
                    min = a;
                }
            }
        }
        System.out.print(min + " " + max);
    }
}