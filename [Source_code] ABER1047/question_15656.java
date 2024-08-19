import java.util.*;
import java.io.*;

public class question_15656
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
        numbers = new int[n];
        visited = new boolean[n];
        
        
        tmp = br.readLine().split(" ");
        for (int i = 0; i < tmp.length; i++) 
        {
            numbers[i] = Integer.parseInt(tmp[i]);
        }
        
        // 숫자 정렬 (사전 순으로 출력하기 위함)
        Arrays.sort(numbers);
        
        // DFS를 사용하여 조합 생성 및 출력
        int combination[] = new int[m];
        dfs(0, combination);
        bw.flush();
    }
    
    // DFS 메소드
    private static void dfs(int depth, int[] combination) throws IOException
    {
        // M개의 숫자가 선택된 경우 조합을 출력
        if (depth == m) 
        {
            for (int i = 0; i < m; i++) 
            {
                bw.write(combination[i] + " ");
            }
            bw.write("\n");
        }
        else
        {
            for (int i = 0; i < n; i++) 
            {
                if (!visited[i])
                {
                    combination[depth] = numbers[i];
                    dfs(depth+1, combination);
                }
            }
        }
    }
}
