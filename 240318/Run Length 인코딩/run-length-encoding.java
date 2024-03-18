import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String encoded ="";

        char currChar = str.charAt(0);
        int numChar = 1;

        for ( int i = 1 ; i < str.length() ; i++ ) {
            if ( str.charAt(i) == currChar )
                numChar++;
            else {
                encoded += currChar;
                encoded += numChar;

                currChar = str.charAt(i);
                numChar = 1;
            }
        }
                encoded += currChar;
                encoded += numChar;

        System.out.println(encoded.length());
        System.out.println(encoded);
    }
}