import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for ( int i = 0 ; i < n ; i++ ) {
            if ( i % 2 == 0 ) {
                int a = i*n+1;
                for ( int j = 0 ; j < n ; j++ ) {
                System.out.print(a + " ");
                a++;
                }
            }
            else {
                int a = (i+1)*n;
                for ( int j = 0 ; j < n ; j++ ) {
                    System.out.print(a + " ");
                    a--;
                }
            }
            System.out.println();
            }
        
    }
}