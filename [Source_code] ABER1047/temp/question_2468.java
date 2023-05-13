import java.io.*;
import java.util.*;

public class question_2468
{
    static int n, assigned_address = 0, k = 0;
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        n = Integer.parseInt(br.readLine());
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        int map_array[][] = new int[n][n];
        
        int max = 0;
        //load map
        for(int i = 0; i < n; i++)
        {
            String[] str = br.readLine().split(" ");
            
            for(int ii = 0; ii < n; ii++)
            {
                map_array[i][ii] = Integer.parseInt(str[ii]);
                if (map_array[i][ii] > max)
                {
                    max = map_array[i][ii];
                }
            }
        }
        
        
        //dfs
        for(; k <= max; k++)
        {
            assigned_address = 0;
            for(int i = 0; i < n; i++)
            {
                for(int ii = 0; ii < n; ii++)
                {
                    if (ii >= 0 && i >= 0 && ii < n && i < n && map_array[i][ii] > k)
                    {
                        assigned_address ++;
                        dfs(map_array, i, ii);
                    }
                }
            }
            
            ans.add(assigned_address);
        }
        
        Collections.sort(ans);
        
        //정답 출력
        bw.write(ans.get(0)+"\n");
        bw.flush();
        bw.close();
    }
    
    
    static void dfs(int[][] map_array, int xx, int yy)
    {
        int dx[] = {1,0,-1,0};
        int dy[] = {0,-1,0,1};

        for(int i = 0; i < 4; i++)
        {
            int to_xx = xx+dx[i];
            int to_yy = yy+dy[i];
            
            if (to_xx >= 0 && to_yy >= 0 && to_xx < n && to_yy < n && map_array[to_xx][to_yy] > k)
            {
                dfs(map_array, to_xx, to_yy);
            }
        }
    }
}