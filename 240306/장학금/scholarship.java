import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if ( a >= 90 && b >= 95 )
        System.out.print(10);
        else if ( a >= 90 && b >= 90 )
        System.out.print(5);
        else
        System.out.print(0);
    }
}