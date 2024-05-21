import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> v = new ArrayList<>();
        
        int n = sc.nextInt();
        for ( int i = 0 ; i < n ; i++ ) {
            String str = sc.next();

            switch ( str ) {
                case "push_back" :
                    int a = sc.nextInt();
                    v.add(a);
                    break;
                case "pop_back" :
                    v.remove(v.size()-1);
                    break;
                case "size" :
                    System.out.println(v.size());
                    break;
                case "get" :
                    int k = sc.nextInt();
                    Iterator<Integer> it = v.iterator();
                    for ( int j = 0 ; j < k-1 ; j++ )
                        it.next();
                    System.out.println(it.next());
                    break;
            }
        }
    }
}