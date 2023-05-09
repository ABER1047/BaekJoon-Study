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
        
        int t_xx = 0, t_yy = 0;
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
        
        
        //1. 빙산 서칭
        //2. dfs로 빙산의 나눠진 구역 체크 (있으면 현재 년도 출력하고 엔드)
        //3. 서칭하면서 주변에 바다가 있는 구역은 어레이에 집어넣음.
        //4. 나눠진 구역 체크가 끝나면 어레이에 있는 구역 1만큼 빼기 (= 1년 지남)
        //무한 반복
        
        loop:
        while(true)
        {   
            //분리된 구역 갯수 표기
            ice_exists = 0;
            asigned_address = 0;
            
            //visited_map_array 리셋
            for(i = 0; i < height; i++)
            {
                for(ii = 0; ii < width; ii++)
                {
                    visited_map_array[ii][i] = 0;
                }
            }
            
            //끝 자락 빙산 위치 저장용 Arraylist 초기화
            outside_xx.clear();
            outside_yy.clear();
            
                
            //서칭            
            for(i = 0; i < height; i++)
            {
                for(ii = 0; ii < width; ii++)
                {
                    if (map_array[ii][i] > 0 && visited_map_array[ii][i] == 0)
                    {
                        ice_exists = 1;
                        if (asigned_address < 1)
                        {
                            asigned_address ++;
                            dfs(map_array, visited_map_array, ii, i);
                        }
                        else
                        {
                            break loop;
                        }
                    }
                }
            }
            
            //끝자락 빙산들 삭제
            for(k = 0; k < outside_xx.size(); k++)
            {
                t_xx = outside_xx.get(k);
                t_yy = outside_yy.get(k);
                map_array[t_yy][t_xx]--;
            }
            
            //1년 지남
            years++;
            
            
            //빙산이 모두 없어져서 존재하지 않는 경우
            if (ice_exists == 0)
            {
                break loop;
            }
        }
        
        
        //정답 출력
        int ans = (asigned_address == 0) ? 0 : years;
		bw.write(ans+"\n");
        bw.flush();
    }
    
    //dfs로 분리된 빙산 찾기
    static void dfs(int[][] map_array, int[][] visited_map_array, int n_x, int n_y)
    {
        for(int i = 0; i < 4; i++)
        {
            //지나온 길 표기
            visited_map_array[n_x][n_y] = asigned_address;
                
            //체크할 좌표
            int dx = n_x+xx[i];
            int dy = n_y+yy[i];
            
            
            //배열에서 벗어나는지 체크
            if (dx >= 0 && dx < width && dy >= 0 && dy < height)
            {
                if (visited_map_array[dx][dy] == 0)
                {
                    if (map_array[dx][dy] > 0)
                    {
                        dfs(map_array, visited_map_array, dx, dy);
                    }
                    else
                    {
                        outside_xx.add(n_y);
                        outside_yy.add(n_x);
                    }
                }
            }
        }
    }
}
