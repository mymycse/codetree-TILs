import java.util.*;

class Info {
    String name;
    int height, weight;

    Info (String a, int b, int c) {
        this.name = a;
        this.height = b;
        this.weight = c;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Info[] info = new Info[n];

        for ( int i = 0 ; i < n ; i++ ) 
            info[i] = new Info(sc.next(), sc.nextInt(), sc.nextInt());
        
        Arrays.sort(info, (a,b) -> a.height - b.height);

        for ( int i = 0 ; i < n ; i++ )
            System.out.printf("%s %d %d\n", info[i].name, info[i].height, info[i].weight);
    }
}