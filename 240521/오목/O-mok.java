import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] map = new int[19][19];

        // 바둑판 입력
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        int win = 0;
        int r = 0;
        int c = 0;

        // 방향 배열: 가로, 세로, 오른쪽 아래 대각선, 왼쪽 아래 대각선
        int[][] directions = {{0, 1}, {1, 0}, {1, 1}, {1, -1}};

        outerLoop:
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (map[i][j] != 0) {
                    int color = map[i][j];

                    for (int[] direction : directions) {
                        int count = 1;
                        int x = i + direction[0];
                        int y = j + direction[1];

                        while (count < 5 && x >= 0 && x < 19 && y >= 0 && y < 19 && map[x][y] == color) {
                            count++;
                            x += direction[0];
                            y += direction[1];
                        }

                        if (count == 5) {
                            // 이전 위치 체크
                            int prevX = i - direction[0];
                            int prevY = j - direction[1];
                            if (prevX >= 0 && prevX < 19 && prevY >= 0 && prevY < 19 && map[prevX][prevY] == color) {
                                continue;
                            }

                            // 다음 위치 체크
                            int nextX = x;
                            int nextY = y;
                            if (nextX >= 0 && nextX < 19 && nextY >= 0 && nextY < 19 && map[nextX][nextY] == color) {
                                continue;
                            }

                            win = color;
                            r = i + direction[0] * 2 + 1; // 중앙 위치
                            c = j + direction[1] * 2 + 1;
                            break outerLoop;
                        }
                    }
                }
            }
        }

        System.out.println(win);

        if (win != 0) {
            System.out.println(r + " " + c);
        }
    }
}