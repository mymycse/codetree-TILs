import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for ( int i = 1 ; i < 5 ; i++ ) {
            int c = i*2;
            for ( int j = b ; j >= a ; j-- ) {
                System.out.print(j + " * " + c + " = " + j*c);
                if ( j != a )
                System.out.print(" / ");
            }
            System.out.println();
        }
    }
}