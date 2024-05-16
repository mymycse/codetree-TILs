import java.util.Scanner;

class Bomb {
    String code;
    char color;
    int second;

    public Bomb() {
        code = "";
        color = ' ';
        second = 0;
    }

    public Bomb ( String str , char c , int s ) {
        this.code = str;
        this.color = c;
        this.second = s;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bomb bomb = new Bomb(sc.next(), sc.next().charAt(0), sc.nextInt());

        System.out.println( "code : " + bomb.code );
        System.out.println( "color : " + bomb.color );
        System.out.println( "second : " + bomb.second );
    }
}