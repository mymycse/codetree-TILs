import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int n = sc.nextInt();
        int i = 1;
        int t = a + n;

        do {
            System.out.println(t);
            t += n;
            i++;
        }
        while ( i <= n );
    }
}