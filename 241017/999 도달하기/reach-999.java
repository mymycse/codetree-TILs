import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(1 + " ");
        System.out.print(n + " ");

        int num1 = 1;
        int num2 = n;
        while ( true ) {
            int temp = num1+num2;
            System.out.print(temp + " ");

            if ( temp > 999 )
                break;

            num1 = num2;
            num2 = temp;
        }
    }
}