import java.io.*;
import java.util.*;

public class question_2583
{
    static int n = 0, m = 0, k = 0, area = 0, divided_area_num = 0;
    
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str1 = br.readLine().split(" ");
        m = Integer.parseInt(str1[0]);
        n = Integer.parseInt(str1[1]);
        k = Integer.parseInt(str1[2]);
        
        ArrayList<Integer> ans_area = new ArrayList<Integer>();
        
        //m = 세로줄, n = 가로줄
        int map_array[][] = new int[m][n];
        

        
        //맵 생성
        for(int j = 0; j < k; j++)
        {
            String[] str2 = br.readLine().split(" ");
            int start_xx = Integer.parseInt(str2[0]);
            int start_yy = Integer.parseInt(str2[1]);
            int end_xx = Integer.parseInt(str2[2]);
            int end_yy = Integer.parseInt(str2[3]);
            
            for(int i = start_yy; i < end_yy; i++)
            {
                for(int ii = start_xx; ii < end_xx; ii++)
                {
                    map_array[i][ii] = 1;
                }
            }
        }

        
        
        //분리된 영역 갯수 구하기
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if (map_array[i][j] != 1)
                {
                    area ++;
                    divided_area_num ++;
                    //첫번째 시작 지점은 직접 지나왔다고 해줬음
                    map_array[i][j] = 1;
                    dfs_get_divided_area(map_array, j, i);
                }
                else
                {
                    if (area > 0)
                    {
                        ans_area.add(area);
                        area = 0;
                    }
                }
            }
        }
    
        
        //정렬
		Collections.sort(ans_area);
        bw.write(divided_area_num+"\n");
            //정답 출력
            if (ans_area.size() == 0)
            {
                bw.write(0+"\n");
            }
            else
            {
                for(int i = 0; i < ans_area.size(); i++)
                {
                    bw.write(ans_area.get(i)+" ");
                }
            }
        bw.write("\n");
        bw.flush();
    }
    
    
    
    
    //dfs to get divided area num
    static void dfs_get_divided_area(int[][] map_array, int n_y, int n_x)
    {
        int[] dy = {0, 1, 0, -1};
        int[] dx = {1, 0, -1, 0};
        
        
        for(int i = 0; i < 4; i++)
        {
            //체크할 이동 가능한 위치
            int xx = n_x+dx[i];
            int yy = n_y+dy[i];
            
            if (xx >= 0 && yy >= 0 && xx < n && yy < m && map_array[xx][yy] != 1)
            {
                //가야되는 위치가 도착지점인 경우
                //지나온 지점 표시
                area ++;
                map_array[xx][yy] = 1;
                dfs_get_divided_area(map_array, xx, yy);
            }
        }
    }
}
