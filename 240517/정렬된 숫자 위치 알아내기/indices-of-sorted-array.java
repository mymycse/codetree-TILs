import java.util.Scanner;
import java.util.Arrays;

class Seq {
    int num, ord, loc;

    public Seq(int a, int b, int c){
        this.num = a;
        this.ord = b;
        this.loc = c;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Seq[] seq = new Seq[n];

        for ( int i = 0 ; i < n ; i++ )
            seq[i] = new Seq(sc.nextInt(), i+1, 0);

        Arrays.sort(seq, (a,b) -> a.num - b.num);

        for ( int i = 0 ; i < n ; i++ )
            seq[i].loc = i+1;

        Arrays.sort(seq, (a,b) -> a.ord - b.ord);

        for ( int i = 0 ; i < n ; i++ )
            System.out.print(seq[i].loc + " ");
    }
}