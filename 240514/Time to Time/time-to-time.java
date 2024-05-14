import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = 0;

        int hf = sc.nextInt();
        int mf = sc.nextInt();
        int hl = sc.nextInt();
        int ml = sc.nextInt();

        while ( true ) {
            if ( hf == hl && mf == ml )
                break;
            mf++;
            time++;
            if ( mf == 60 ) {
                hf++;
                mf = 0;
            }
        }

        System.out.print(time);
    }
}