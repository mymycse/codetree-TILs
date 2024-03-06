import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Aa = sc.nextInt();
        int Ab = sc.nextInt();
        int Ba = sc.nextInt();
        int Bb = sc.nextInt();

        if ( Aa > Ba )
        System.out.print("A");
        else if ( Ba > Aa )
        System.out.print("B");
        else if ( Ab > Bb )
        System.out.print("A");
        else
        System.out.print("B");
    }
}