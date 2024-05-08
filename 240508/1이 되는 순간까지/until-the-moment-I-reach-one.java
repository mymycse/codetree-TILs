import java.util.*;

public class Main {
    static int cnt = 0;
    public static int untilOne(int n) {
        if ( n == 1 )
            return cnt;
        cnt++;
        if ( n % 2 == 0 )
            return untilOne(n/2);
        else
            return untilOne(n/3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        System.out.print(untilOne(n));
    }
}