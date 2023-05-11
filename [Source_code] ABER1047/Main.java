import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int M, N, K; // 5, 7, 3
    static boolean[][] map;
    static int ax, ay, bx, by;
    static int count;
    static Queue<Integer[]> queue;
    static List<Integer> area;

    static int[] dy = {0, 1, 0, -1};
    static int[] dx = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        M = Integer.parseInt(st.nextToken());   // 5
        N = Integer.parseInt(st.nextToken());   // 7
        K = Integer.parseInt(st.nextToken());   // 3

        map = new boolean[M][N];    // 반복 여부와 직사각형
        queue = new LinkedList<>();
        area = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            ax = Integer.parseInt(st.nextToken());
            ay = Integer.parseInt(st.nextToken());
            bx = Integer.parseInt(st.nextToken());
            by = Integer.parseInt(st.nextToken());

            for (int y = ay; y < by; y++) {
                for (int x = ax; x < bx; x++) {
                    map[y][x] = true;
                }
            }
        }

        while (isVisit()) {
            count++;
            area.add(BFS());
        }
        sb.append(count);
        sb.append("\n");

        Object[] sorted = area.toArray();
        Arrays.sort(sorted);

        for (int i = 0; i < sorted.length; i++) {
            sb.append(sorted[i].toString()).append(" ");
        }

        System.out.print(sb);
    }

    private static boolean isVisit() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == false) {
                    queue.add(new Integer[]{i, j});
                    map[i][j] = true;
                    return true;
                }
            }
        }
        return false;
    }

    private static int BFS() {
        int now_area = 0;
        while (!queue.isEmpty()) {
            Integer[] now = queue.poll();
            now_area++;

            for (int i = 0; i < 4; i++) {
                int now_y = now[0] + dy[i];
                int now_x = now[1] + dx[i];

                if (now_y < 0 || now_y >= M || now_x < 0 || now_x >= N) {
                    continue;
                }
                if (!map[now_y][now_x]) {
                    queue.add(new Integer[]{now_y, now_x});
                    map[now_y][now_x] = true;
                }
            }
        }
        return now_area;
    }
}