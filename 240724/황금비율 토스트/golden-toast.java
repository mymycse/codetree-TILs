import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        LinkedList<Character> bread = new LinkedList<>();
        String str = sc.next();

        for ( int i = 0 ; i < n ; i++ )
            bread.add(str.charAt(i));

        ListIterator<Character> it = bread.listIterator();
        
        for ( int i = 0 ; i < n ; i++ ) 
            it.next();

        while ( m-- > 0 ) {
            char c = sc.next().charAt(0);

            switch ( c ) {
                case 'L':
                    if ( it.hasPrevious() )
                        it.previous();
                    break;
                case 'R':
                    if ( it.hasNext() )
                        it.next();
                    break;
                case 'D':
                    if ( it.hasNext() ) {
                        it.next();
                        it.remove();
                    }
                    break;
                case 'P':
                    char f = sc.next().charAt(0);
                    it.add(f);
                    break;
            }
        }

        String result = "";

        for ( char c : bread )
            result += c;

        System.out.println(result);
    }
}