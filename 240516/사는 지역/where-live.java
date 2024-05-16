import java.util.*;

class Info {
    String name, addr, city;

    Info(String a, String b, String c) {
        this.name = a;
        this.addr = b;
        this.city = c;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Info[] info = new Info[n];
        String[] name = new String[n];

        for ( int i = 0 ; i < n ; i++ ) {
            String a = sc.next();
            name[i] = a;
            info[i] = new Info(a, sc.next(), sc.next());
        }

        Arrays.sort(name);
        String NAME = name[n-1];
        int idx = 0;

        for ( int i = 0 ; i < n ; i++ ) {
            if ( NAME.equals(info[i].name) ) {
                idx = i;
                break;
            }
        }

        System.out.println("name " + info[idx].name);
        System.out.println("addr " + info[idx].addr);
        System.out.println("city " + info[idx].city);
    }
}