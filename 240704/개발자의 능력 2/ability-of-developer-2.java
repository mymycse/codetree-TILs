import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dev = new int[6];

        for ( int i = 0 ; i < 6 ; i++ )
            dev[i] = sc.nextInt();

        Arrays.sort(dev);

        int[] team = {dev[0]+dev[5], dev[1]+dev[4], dev[2]+dev[3]};

        Arrays.sort(team);

        System.out.println(team[2]-team[0]);
    }
}