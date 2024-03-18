import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int a = str.length();

        for ( int i = a-1 ; i >= 0 ; i-- ) {
            if ( i % 2 == 1 )
            System.out.print(str.charAt(i));
        }
    }
}