import java.util.Scanner;

public class Main {
    public static int min ( int a , int b , int c ) {

        if ( a < b ) {
            if ( c < a )
                return c;
            else 
                return a;}
        else {
            if ( b > c )
                return c;
            else
                return b;}

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = min(a,b,c);

        System.out.print(result);
    }
}