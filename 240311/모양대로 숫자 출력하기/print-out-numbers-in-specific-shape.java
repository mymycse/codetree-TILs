import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for ( int i = 0 ; i < n ; i++ ) {
            int cnt = n;
            for ( int j = 0 ; j < n ; j++ ) {
                if ( j < i ) {
                    System.out.print("  ");
                    cnt--;
                }
                else {
                    System.out.print(cnt + " ");
                    cnt--;
                }
            }
            System.out.println();
        }
    }
}