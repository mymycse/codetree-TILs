import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int s = str.length();
        int sum = 0;

        for ( int i = 0 ; i < s ; i++ ) {
            char x = str.charAt(i);

            if ( '0' <= x && x <= '9' ) 
                sum += (int)x - 48;
        }
        System.out.print(sum);
    }
}