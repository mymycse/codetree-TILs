import java.util.Scanner;

public class Main {
    public static boolean check ( String str ) {
        char c = str.charAt(0);

        for ( int i = 1 ; i < str.length() ; i++ ) {
            if ( c != str.charAt(i) )
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        if ( check(str) )
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}