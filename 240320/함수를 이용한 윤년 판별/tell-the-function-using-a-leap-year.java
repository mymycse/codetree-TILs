import java.util.Scanner;

public class Main {
    public static boolean onjeonsu( int n ) {
        if ( n % 4 == 0 ) {
            if ( n % 100 == 0 && n % 400 != 0 )
                return false;
            else
                return true;
        }
        else
            return false;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(onjeonsu(n));
    }
}