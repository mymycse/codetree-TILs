import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for ( int i = 1 ; i <= n ; i++ )
            q.add(i);

        for ( int i = 0 ; i < n ; i++ ) {
            for ( int j = 0 ; j < k-1 ; j++ ) {
                int temp = q.poll();
                q.add(temp);
            }
            System.out.print(q.poll() + " ");
        }
    }
}