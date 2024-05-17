import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

class Dim implements Comparable<Dim>{
    int x, y, num;

    Dim(int a, int b, int c) {
        this.x = a;
        this.y = b;
        this.num = c;
    }

    @Override
    public int compareTo(Dim dim) {
        return (Math.abs(this.x)+Math.abs(this.y)) - (Math.abs(dim.x)+Math.abs(dim.y));
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Dim[] dim = new Dim[n];

        for ( int i = 0 ; i < n ; i++ )
            dim[i] = new Dim(sc.nextInt(), sc.nextInt(), i+1);

        Arrays.sort(dim);

        for ( int i = 0 ; i < n ; i++ )
            System.out.println(dim[i].num);
    }
}