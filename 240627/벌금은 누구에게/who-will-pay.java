import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] st = new int[n+1];
        int result = -1;

        for ( int i = 0 ; i < m ; i++ ) {
            int student = sc.nextInt();
            st[student]++;

            if ( st[student] >= k ) {
                result = student;
                break;
            }
        }

        System.out.println(result);
    }
}