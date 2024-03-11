import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for ( int i = 1 ; i <= 9 ; i++ ) {
            int c = b;
            for ( int j = 0 ; j <= (b-a)/2 ; j++ ) {
                System.out.print(c + " * " + i + " = " + c*i);
                c -= 2;

                if ( j < (b-a)/2 )
                System.out.print(" / ");
            }
            System.out.println();
        }
    }
}