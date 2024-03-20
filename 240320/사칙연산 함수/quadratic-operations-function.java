import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char b = sc.next().charAt(0);
        int c = sc.nextInt();

        if ( b == '+' )
            System.out.printf( "%d + %d = %d", a, c, a+c);
        else if ( b == '-' )
            System.out.printf( "%d - %d = %d", a, c, a-c);
        else if ( b == '*' )
            System.out.printf( "%d * %d = %d", a, c, a*c);
        else if ( b == '/' )
            System.out.printf( "%d / %d = %d", a, c, a/c);
        else
            System.out.print("False");
    }
}