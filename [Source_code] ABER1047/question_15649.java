import java.util.*;
import java.io.*;

public class question_15649
{
    public static boolean[] visited; // 방문 여부를 확인하기 위한 배열
    public static int[] arr; // 현재 수열을 저장할 배열
    public static int n, m; // n, m 값을 저장할 변수
    public static StringBuilder sb = new StringBuilder(); // 출력을 모아둘 StringBuilder

    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        arr = new int[m]; // m개의 수열을 저장할 배열
        visited = new boolean[n]; // n개의 숫자의 방문 여부를 저장할 배열
        
        dfs(0);
        
        System.out.println(sb); // 모든 결과를 한 번에 출력
    }
    
    public static void dfs(int depth) 
    {
        if (depth == m) { // m개의 숫자를 모두 선택한 경우
            for (int i = 0; i < m; i++) 
            {
                sb.append(arr[i]).append(' '); // 배열의 원소를 sb에 추가
            }
            sb.append('\n'); // 줄바꿈 추가
            return;
        }
        
        for (int i = 0; i < n; i++) 
        {
            if (!visited[i]) { // 방문하지 않은 숫자라면
                visited[i] = true; // 방문 처리
                arr[depth] = i + 1; // 현재 depth에 해당 숫자를 추가
                dfs(depth + 1); // 다음 depth로 재귀 호출
                visited[i] = false; // 백트래킹: 원상태로 돌려놓기
            }
        }
    }
}