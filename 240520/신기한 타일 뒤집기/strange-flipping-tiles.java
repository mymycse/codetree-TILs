import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] flip = new int[200_001];
        int loc = 100_000;

        while ( n-- > 0 ) {
            int x = sc.nextInt();
            char c = sc.next().charAt(0);

            switch(c) {
                case 'R' :
                    while ( x-- > 0 ) {
                        flip[loc] = 1;
                        if ( x != 0 )
                            loc++;
                    }
                    break;
                case 'L' :
                    while ( x-- > 0 ) {
                        flip[loc] = -1;
                        if ( x != 0 )
                            loc--;
                    }
                    break;
            }
        }

        int white = 0;
        int black = 0;

        for ( int i : flip ) {
            if ( i == 0 )
                continue;
            else if ( i == 1 )
                black++;
            else
                white++;
        }

        System.out.print( white + " " + black );
    }
}