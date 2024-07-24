import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList <Integer> l = new LinkedList<>();

        int n = sc.nextInt();

        while ( n-- > 0 ) {
            String str = sc.next();
            int a;

            switch ( str ) {
                case "push_front":
                    a = sc.nextInt();
                    l.addFirst(a);
                    break;
                case "push_back":
                    a = sc.nextInt();
                    l.addLast(a);
                    break;
                case "pop_front":
                    System.out.println(l.pollFirst());
                    break;
                case "pop_back":
                    System.out.println(l.pollLast());
                    break;
                case "size":
                    System.out.println(l.size());
                    break;
                case "empty":
                    System.out.println(l.isEmpty() ? 1 : 0 );
                    break;
                case "front":
                    System.out.println(l.peekFirst());
                    break;
                case "back":
                    System.out.println(l.peekLast());
                    break;
            }
        }
    }
}