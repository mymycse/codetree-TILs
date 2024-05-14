import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> dq = new ArrayDeque<>();

        int n = sc.nextInt();
        for ( int i = 1 ; i <= n ; i++ )
            dq.add(i);

        for ( int i = 0 ; i < n-1 ; i++ ) {
            dq.pollFirst();
            int temp = dq.pollFirst();
            dq.add(temp);
        }
        System.out.print(dq.pollFirst());
    }
}