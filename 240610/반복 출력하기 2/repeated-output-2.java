import java.util.Scanner;

public class Main {
    static void star(int n) {
        if ( n == 0 )
            return;
        
        System.out.println("HelloWorld");
        star(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        star(n);
    }
}