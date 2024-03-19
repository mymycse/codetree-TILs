import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int s = str.length();

        for ( int i = 0 ; i < s ; i++ ) {
            char x = str.charAt(i);

            if ( 'a' <= x && x <= 'z') {
                int k = (char)x;
                System.out.print((char)(k-32));
            }
            else {
                int k = (char)x;
                System.out.print((char)(k+32));
            }
        }
    }
}