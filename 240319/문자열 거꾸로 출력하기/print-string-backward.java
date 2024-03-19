import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while ( sc.hasNextLine() ) {
            String str = sc.next();

            if ( str.equals("END") )
                break;
            
            int s = str.length();

            for ( int j = s-1 ; j >= 0 ; j-- ) 
                System.out.print( str.charAt(j) );
            
            System.out.println();
        }
    }
}