import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Aa = sc.nextInt();
        int Ab = sc.nextInt();
        int Ba = sc.nextInt();
        int Bb = sc.nextInt();

        if ( Aa > Ba && Ab > Bb )
        System.out.print(1);
        else
        System.out.print(0);
    }
}