import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        for ( int i = 0 ; i < s1.length() ; i++ ) {
            char c = s1.charAt(i);
            if ( c != ' ' )
            System.out.print(c);
        }

        for ( int i = 0 ; i < s2.length() ; i++ ) {
            char c = s2.charAt(i);
            if ( c != ' ' )
            System.out.print(c);
        }
    }
}