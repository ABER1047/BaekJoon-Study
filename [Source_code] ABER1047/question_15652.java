import java.util.*;
import java.io.*;

public class question_15652 
{
    static int numbers[]; // 입력된 자연수들
    static int n; // 전체 숫자의 개수
    static int m; // 선택할 숫자의 개수
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static boolean visited[];
    
    public static void main(String[] args) throws IOException
    {
        String tmp[] = br.readLine().split(" ");
        n = Integer.parseInt(tmp[0]);
        m = Integer.parseInt(tmp[1]);
        numbers = new int[n+1];
        visited = new boolean[n];
        
        
        // DFS를 사용하여 조합 생성 및 출력
        dfs(0);
        bw.flush();
    }
    
    // DFS 메소드
    private static void dfs(int depth) throws IOException
    {
        // M개의 숫자가 선택된 경우 조합을 출력
        if (depth == m) 
        {
            for (int i = 0; i < m; i++) 
            {
                bw.write(numbers[i] + " ");
            }
            bw.write("\n");
        }
        else
        {
            for (int i = 1; i <= n; i++) 
            {
                if (depth == 0 || numbers[depth - 1] <= i) // 중복되지 않는 순열을 보장하기 위한 조건
                {
                    numbers[depth] = i;
                    dfs(depth+1);
                }
            }
        }
    }
}
