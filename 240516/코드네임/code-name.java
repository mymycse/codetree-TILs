import java.util.Scanner;

class Agent {
    char codename;
    int score;

    public Agent() {
        codename = ' ';
        score = 0;
    }

    public Agent (char c, int s) {
        this.codename = c;
        this.score = s;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agent[] agents = new Agent[5];

        for ( int i = 0 ; i < 5 ; i++ ) {
            char c = sc.next().charAt(0);
            int s = sc.nextInt();
            agents[i] = new Agent(c,s);
        }

        int min = agents[0].score;
        int idx = 0;

        for ( int i = 1 ; i < 5 ; i++ ) {
            if (agents[i].score < min) {
                idx = i;
                min = agents[i].score;
            }
        }

        System.out.println(agents[idx].codename + " " + agents[idx].score);
    }
}