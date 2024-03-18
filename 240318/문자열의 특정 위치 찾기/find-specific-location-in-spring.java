import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String c = sc.next();

        if ( str.contains(c) )
            System.out.print( str.indexOf(c) );
        else
            System.out.print( "No" );
    }
}