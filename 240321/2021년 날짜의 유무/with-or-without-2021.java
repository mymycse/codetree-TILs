import java.util.Scanner;

public class Main {
    public static boolean isMonth( int m , int d ) {

        if ( m > 12 || d > 31 )
            return false;
        else if ( m == 2 && d < 29 )
            return true;
        else if ( ( m < 8 && m % 2 == 0 || m > 8 && m % 2 == 1 ) && d < 31 )
            return true;
        else {
            if ( d < 32 )
                return true;
        }
        
        return false;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int d = sc.nextInt();

        if ( isMonth (m,d) )
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}