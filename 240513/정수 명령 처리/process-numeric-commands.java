import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();

        for ( int i = 0 ; i < n ; i++ ) {
            String str = sc.next();

            if ( str.equals("push") ) {
                int k = sc.nextInt();
                st.push(k);
            }
            else if ( str.equals("pop") )
                System.out.println(st.pop());
            else if ( str.equals("size") )
                System.out.println(st.size());
            else if ( str.equals("empty") )
                if ( st.isEmpty() )
                    System.out.println(1);
                else 
                    System.out.println(0);
            else
                System.out.println(st.peek());
        }
    }
}