import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char c = sc.next().charAt(0);

        int a = s.length();
        int cnt = 0;

        for ( int i = 0 ; i < a ; i++ ) {
            if ( s.charAt(i) == c )
            cnt++;
        }
        System.out.print(cnt);
    }
}