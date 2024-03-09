import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for ( ;; ) {
            if ( n >= 1000 ) {
                System.out.print(cnt);
                break;
            }
            if ( n % 2 == 0 ) {
                n *= 3;
                n++;
            }
            else {
                n *= 2;
                n += 2;
            }
            cnt++;
        }
    }
}