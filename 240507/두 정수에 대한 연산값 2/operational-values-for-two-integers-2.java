import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if ( a > b )
            System.out.print(a*2 + " " + b+10);
        else
            System.out.print(a+10 + " " + b*2);
    }
}