import java.util.Scanner;

public class Main {
    public static int max(int a) {
        return a*2;
    }
    public static int min(int b) {
        return b+10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if ( a > b )
            System.out.print(max(a) + " " + min(b));
        else
            System.out.print(min(a) + " " + max(b));
    }
}