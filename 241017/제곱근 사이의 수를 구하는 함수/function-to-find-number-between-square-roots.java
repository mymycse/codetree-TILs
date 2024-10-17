import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        double d1 = Math.sqrt(Double.parseDouble(st.nextToken()));
        double d2 = Math.sqrt(Double.parseDouble(st.nextToken()));

        int cnt = (int)d1 - (int)d2;

        System.out.println(Math.abs(cnt));
    }
}