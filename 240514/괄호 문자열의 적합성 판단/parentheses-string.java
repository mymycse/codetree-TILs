import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> s = new Stack<>();

        for ( int i = 0 ; i < str.length() ; i++ ) {
            if ( str.charAt(i) == '(' )
                s.push(str.charAt(i));
            else {
                if (s.isEmpty()) {
                    System.out.println("No");
                    System.exit(0);
                }
                s.pop();
            }
        }

        if ( s.isEmpty() )
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}