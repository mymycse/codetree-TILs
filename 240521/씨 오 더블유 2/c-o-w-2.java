import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int cnt = 0;

        char[] cow = str.toCharArray();

        for ( int i = 0 ; i < n ; i++ )
            for ( int j = i+1 ; j < n ; j++ )
                for ( int k = j+1 ; k < n ; k++ )
                    if ( cow[i] == 'C' && cow[j] == 'O' && cow[k] == 'W' )
                        cnt++;

        System.out.println(cnt);
    }
}