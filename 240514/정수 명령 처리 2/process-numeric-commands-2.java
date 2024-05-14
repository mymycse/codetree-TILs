import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for ( int i = 0 ; i < n ; i++ ) {
            String str = sc.next();
            if ( str.equals("push") ) {
                int k = sc.nextInt();
                q.add(k);
            } else if ( str.equals("pop") ) {
                System.out.println(q.poll());
            } else if ( str.equals("size") ) {
                System.out.println(q.size());
            } else if ( str.equals("empty") ) {
                if (q.isEmpty())
                    System.out.println(1);
                else
                    System.out.println(0);
            } else {
                System.out.println(q.peek());
            }
        }
    }
}