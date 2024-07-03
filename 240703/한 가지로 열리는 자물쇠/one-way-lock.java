import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] lock = new int[3];

        for ( int i = 0 ; i < 3 ; i++ )
            lock[i] = sc.nextInt();

        int cnt = 0;

        for ( int a = 1 ; a <= n ; a++ )
            for ( int b = 1 ; b <= n ; b++ )
                for ( int c = 1 ; c <= n ; c++ )
                    if ( Math.abs(lock[0]-a) <= 2 || Math.abs(lock[1]-b) <= 2 || Math.abs(lock[2]-c) <= 2 )
                        cnt++;

        System.out.println(cnt);
    }
}