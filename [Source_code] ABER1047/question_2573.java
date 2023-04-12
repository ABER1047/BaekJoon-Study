import java.util.*;
import java.io.*;


public class question_2573 
{
    static int xx[] = {0,1,0,-1};
    static int yy[] = {-1,0,1,0};
    static int width = 0, height = 0, years = 0, asigned_address = 0, b_asigned_address = 0, ice_exists = 0;
    static ArrayList<Integer> outside_xx = new ArrayList<Integer>();
    static ArrayList<Integer> outside_yy = new ArrayList<Integer>();
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] tokens = br.readLine().split(" ");
        height = Integer.parseInt(tokens[0]);
        width = Integer.parseInt(tokens[1]);
        
        int map_array[][] = new int[width][height];
        int visited_map_array[][] = new int[width][height];
        
        
        int i = 0, ii = 0, k = 0;
        
        //맵 정보 받아오기
        for(i = 0; i < height; i++)
        {
            String[] str = br.readLine().split(" ");
            for(ii = 0; ii < width; ii++)
            {
                map_array[ii][i] = Integer.valueOf(str[ii]);
                visited_map_array[ii][i] = 0;
            }
        }
        
        
        //서칭
        loop:
        while(true)
        {
            //1년 지남
            years ++;
            asigned_address = 0;
            
            //visited_map_array 리셋
            for(i = 0; i < height; i++)
            {
                for(ii = 0; ii < width; ii++)
                {
                    visited_map_array[ii][i] = 0;
                }
            }
                
            //서칭
            for(i = 0; i < height; i++)
            {
                for(ii = 0; ii < width; ii++)
                {
                    if (map_array[ii][i] > 0 && visited_map_array[ii][i] == 0)
                    {
                        ice_exists = 1;
                        if (asigned_address <= 1)
                        {
                            //끝 자락 빙산 위치 저장용
                            ArrayList<Integer> outside_xx = new ArrayList<Integer>();
                            ArrayList<Integer> outside_yy = new ArrayList<Integer>();
                            asigned_address ++;
                            dfs(map_array, visited_map_array, ii, i);
                            
                            //끝자락 빙산들 삭제
                            for(k = 0; k < outside_xx.size(); k++)
                            {
                                int t_xx = outside_xx.get(k);
                                int t_yy = outside_yy.get(k);
                                map_array[t_yy][t_xx] -= (map_array[t_yy][t_xx] > 0) ? 1 : 0;
                            }
                        }
                        else
                        {
                            break loop;
                        }
                    }
                }
            }
            
            if (ice_exists == 0)
            {
                break loop;
            }
        }
        
        
        //정답 출력
        int ans = (ice_exists == 0) ? 0 : years;
		bw.write(ans+"\n");
        bw.flush();
    }
    
    //dfs로 분리된 빙산 찾기
    static void dfs(int[][] map_array, int[][] visited_map_array, int n_x, int n_y)
    {
        int is_outside = 0;
        for(int i = 0; i < 4; i++)
        {
            //지나온 길 표기
            visited_map_array[n_x][n_y] = asigned_address;
                
            //체크할 좌표
            int t_xx = n_x+xx[i];
            int t_yy = n_y+yy[i];
            
            if (t_xx >= 0 && t_xx < width && t_yy >= 0 && t_yy < height)
            {
                if (is_outside == 0 && map_array[t_xx][t_yy] == 0)
                {
                    outside_xx.add(n_x);
                    outside_yy.add(n_y);
                    is_outside = 1;
                }
                
                if (map_array[t_xx][t_yy] > 0 && visited_map_array[t_xx][t_yy] == 0)
                {
                    dfs(map_array, visited_map_array, t_xx, t_yy);
                }
            }
        }
    }
}
