import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] flip = new int[200_001][3];
        int loc = 100_000;

        while ( n-- > 0 ) {
            int x = sc.nextInt();
            char c = sc.next().charAt(0);

            switch(c) {
                case 'R' :
                    while ( x-- > 0 ) {
                        flip[loc][1]++;
                        flip[loc][2] = 1;
                        if ( x != 0 )
                            loc++;
                    }
                    break;
                case 'L' :
                    while ( x-- > 0 ) {
                        flip[loc][0]++;
                        flip[loc][2] = 0;
                        if ( x != 0 )
                            loc--;
                    }
                    break;
            }
        }

        int white = 0;
        int black = 0;
        int gray = 0;

        for ( int i = 0 ; i < flip.length ; i++ ) {
            if ( flip[i][0] == 0 && flip[i][1] == 0 )
                continue;
            else if ( flip[i][0] >= 2 && flip[i][1] >= 2 )
                gray++;
            else if ( flip[i][2] == 1 )
                black++;
            else if ( flip[i][2] == 0 )
                white++;
        }

        System.out.print(white + " " + black + " " + gray);
    }
}