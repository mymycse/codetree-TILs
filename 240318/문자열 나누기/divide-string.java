import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for ( int i = 0 ; i < n ; i++ ) {
            String a = sc.next();
            for ( int j = 0 ; j < a.length() ; j++ ) {
                System.out.print(a.charAt(j));
                cnt++;
                if ( cnt == 5 ) {
                    System.out.println();
                    cnt = 0;
                    }
            }

        }
    }
}