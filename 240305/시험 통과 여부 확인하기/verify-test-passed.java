import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a >= 80) {
        System.out.print("pass");
        }

        else {
            int b = 80 - a;
            System.out.printf("%d more score", b);
        }
    }
}