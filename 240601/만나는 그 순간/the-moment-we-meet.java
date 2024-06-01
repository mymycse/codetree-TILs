import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] dx = {1,-1};
        int dir = 0;
        int a = 0;

        ArrayList<Integer> listA = new ArrayList<>();
        while ( n-- > 0 ) {
            char c = sc.next().charAt(0);
            int s = sc.nextInt();

            if ( c == 'R' )
                dir = 0;
            else
                dir = 1;

            while ( s-- > 0 ) {
                a += dx[dir];
                listA.add(a);
            }
        }

        int[] ansA = listA.stream().mapToInt(x->x).toArray();
        
        int b = 0;

        ArrayList<Integer> listB = new ArrayList<>();
        while ( m-- > 0 ) {
            char c = sc.next().charAt(0);
            int s = sc.nextInt();

            if ( c == 'R' )
                dir = 0;
            else
                dir = 1;

            while ( s-- > 0 ) {
                b += dx[dir];
                listB.add(b);
            }
        }

        int[] ansB = listB.stream().mapToInt(x->x).toArray();

        int answer = -1;

        for ( int i = 0 ; i < ansA.length ; i++ )
            if ( ansA[i] == ansB[i] ) {
                answer = i+1;
                break;
            }
        
        System.out.println(answer);
    }
}