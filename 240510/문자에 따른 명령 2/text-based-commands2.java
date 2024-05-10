import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int fr = 3;
        int[] dx = new int[]{1,0,-1,0};
        int[] dy = new int[]{0,-1,0,1};          
        
        String str = sc.nextLine();

        for ( int i = 0 ; i < str.length() ; i++ ) {
            char c = str.charAt(i);
            
            if ( c == 'F' ) {
                x += dx[fr];
                y += dy[fr];
            } else if ( c == 'R' ) {
                fr = (fr+3)%4;
            } else {
                fr = (fr-1)%4;
            }
        }

        System.out.print( x + " " + y );
    }
}