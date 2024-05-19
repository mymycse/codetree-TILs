import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int x = 1000;
        int cnt = 0;
        int[] map = new int[2001];

        while (n-- > 0) {
            int a = sc.nextInt();
            char b = sc.next().charAt(0);

            for (int i = 0; i < a; i++) {
                if (b == 'R')
                    map[++x]++;
                else
                    map[--x]++;
            }
        }
        
        for (int i = 0; i < map.length; i++) {
            if (map[i] >= 2)
                cnt++;
        }  

        System.out.println(cnt);
    }
}