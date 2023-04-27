import java.io.*;
import java.util.*;

public class question_2178 
{
    static ArrayList<Integer> ans_candidate = new ArrayList<Integer>();
    static int n = 0, m = 0;
    
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str1 = br.readLine().split(" ");
        n = Integer.parseInt(str1[0]);
        m = Integer.parseInt(str1[1]);
        
        //n = 세로줄, m = 가로줄
        int map_array[][] = new int[m][n];
        
        for(int i = 0; i < n; i++)
        {
            String[] str2 = br.readLine().split("");
            for(int ii = 0; ii < m; ii++)
            {
                map_array[ii][i] = Integer.parseInt(str2[ii]);
            }
        }
        
        //첫번째 시작 지점은 직접 지나왔다고 해줬음
        dfs(map_array, 0, 0, 1);
        
        
        //정렬
		Collections.sort(ans_candidate);
        
        //정답 출력
        bw.write(ans_candidate.get(0)+"\n");
        bw.flush();
    }
    
    
    
    //dfs
    static void dfs(int[][] map_array, int n_x, int n_y, int n_passed_num)
    {
        int dx[] = {1,0,-1,0};
        int dy[] = {0,1,0,-1}; //오른쪽, 아래, 왼쪽, 위 (시계 방향)
        
        //지나간 길 표시
        map_array[n_x][n_y] = 0;

        
        for(int i = 0; i < 4; i++)
        {
            //체크할 이동 가능한 위치
            int xx = n_x+dx[i];
            int yy = n_y+dy[i];
            
            if (xx >= 0 && yy >= 0 && xx < m && yy < n && map_array[xx][yy] != 0)
            {
                //가야되는 위치가 도착지점인 경우
                if (xx == m-1 && yy == n-1)
                {
                    //지나간 길 표시에 대해
                    ans_candidate.add(n_passed_num+1);
                }
                else
                {
                    dfs(map_array, xx, yy, n_passed_num+1);
                }
            }
        }
    }
}
