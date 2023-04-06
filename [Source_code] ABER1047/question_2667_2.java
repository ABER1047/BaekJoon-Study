import java.util.*;
import java.io.*;

public class question_2667_2
{
    static int check_pathxx[] = {0,1,0,-1};
    static int check_pathyy[] = {-1,0,1,0};
    static int assign_address = 1, total_house_num = 0;

    public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int size = Integer.parseInt(br.readLine());
        int map_array[][] = new int[size][size];
        
        ArrayList<Integer> ans_house_num = new ArrayList<Integer>();
        
        
        //맵 불러오기
        int i = 0, ii = 0;
		for(i = 0; i < size; i++) 
        {
            String[] str = br.readLine().split("");
            for(ii = 0; ii < size; ii++) 
            {
			    map_array[i][ii] = Integer.valueOf(str[ii]);
		    }
        }
        
        
        //맵 탐색
        for(i = 0; i < size; i++) 
        {
            for(ii = 0; ii < size; ii++) 
            {
                //집 있는지 체크
			    if (map_array[i][ii] == 1)
                {
                    assign_address ++;
                    total_house_num = 1;
                    dfs(i, ii, map_array, size);
                    ans_house_num.add(total_house_num);
                }
            }
        }
            
        
        //정답 출력
        int total_village = assign_address-1;
        bw.write(total_village+"\n");
        //정렬
		Collections.sort(ans_house_num);
        for(i = 0; i < total_village; i++)
        {
            bw.write(ans_house_num.get(i)+"\n");
        }
        bw.flush();
    }
    
    
    //DFS
    static void dfs(int n_xx, int n_yy, int[][] map_array, int size) 
    {
        map_array[n_xx][n_yy] = assign_address;

        for (int i = 0; i < 4; i++) 
        {
            int horizontal_coord = n_xx+check_pathxx[i];
            int vertical_coord = n_yy+check_pathyy[i];

            //범위를 벗어난 경우 건너뜀, 집이 없거나 이미 방문한 경우 건너뜀
            if (horizontal_coord >= 0 && horizontal_coord < size && vertical_coord >= 0 && vertical_coord < size && map_array[horizontal_coord][vertical_coord] == 1) 
            {
                total_house_num ++;
                
                //찾은 길을 기준으로 다음 위치를 탐색
                dfs(horizontal_coord, vertical_coord, map_array, size);
            }
        }
    }
}