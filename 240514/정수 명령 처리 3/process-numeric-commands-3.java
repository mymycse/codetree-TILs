import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> dq = new ArrayDeque<>();

        for ( int i = 0 ; i < n ; i++ ) {
            String str = sc.next();

            if ( str.equals("push_back") ) {
                int k = sc.nextInt();
                dq.addLast(k);
            } else if ( str.equals("push_front") ) {
                int k = sc.nextInt();
                dq.addFirst(k);
            } else if ( str.equals("pop_front") ) {
                System.out.println(dq.pollFirst());
            } else if ( str.equals("pop_back") ) {
                System.out.println(dq.pollLast());
            } else if ( str.equals("size") ) {
                System.out.println(dq.size());
            } else if ( str.equals("empty") ) {
                if ( dq.isEmpty() )
                    System.out.println(1);
                else    
                    System.out.println(0);
            } else if ( str.equals("front") ) {
                System.out.println( dq.peekFirst() );
            } else {
                System.out.println( dq.peekLast() );
            }
        }
    }
}