import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 0, y = 0;
        int[] dx = new int[] {-1, 1};
        int[] dy = new int[] {-1, 1};

        for ( int i = 0 ; i < n ; i++ ) {
            char c = sc.next().charAt(0);
            int a = sc.nextInt();

            if ( c == 'W' ) 
                x += dx[0]*a;
            else if ( c == 'S')
                y += dy[0]*a;
            else if ( c == 'E')
                x += dx[1]*a;
            else 
                y += dy[1]*a;
        }
        System.out.print( x + " " + y );
    }
}