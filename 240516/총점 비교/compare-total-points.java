import java.util.*;

class Score implements Comparable<Score> {
    String name;
    int kor, eng, math;

    Score ( String a, int b, int c, int d ) {
        this.name = a;
        this.kor = b;
        this.eng = c;
        this.math = d;
    }

    @Override
    public int compareTo(Score score) {
        return (this.kor + this.eng + this.math) - (score.kor + score.eng + score.math);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Score[] score = new Score[n];

        for ( int i = 0 ; i < n ; i++ )
            score[i] = new Score(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());

        Arrays.sort(score);

        for ( int i = 0 ; i < n ; i++ )
            System.out.printf("%s %d %d %d\n", score[i].name, score[i].kor, score[i].eng, score[i].math);
    }
}