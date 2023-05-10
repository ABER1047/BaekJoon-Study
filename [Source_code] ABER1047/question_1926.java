import java.util.*;
import java.io.*;

public class question_1926
{
    static int check_pathxx[] = {0,1,0,-1};
    static int check_pathyy[] = {-1,0,1,0};
    static int assign_address = 1, area = 0;

    public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" ");
        int width = Integer.parseInt(str[1]);
        int height = Integer.parseInt(str[0]);
        int map_array[][] = new int[width][height];
        
        ArrayList<Integer> picture_num = new ArrayList<Integer>();
        
        
        //맵 불러오기
        int i = 0, ii = 0;
		for(i = 0; i < height; i++) 
        {
            String[] str2 = br.readLine().split(" ");
            for(ii = 0; ii < width; ii++) 
            {
			    map_array[ii][i] = Integer.valueOf(str2[ii]);
		    }
        }
        
        
        //맵 탐색
        for(i = 0; i < height; i++) 
        {
            for(ii = 0; ii < width; ii++) 
            {
                //집 있는지 체크
			    if (map_array[ii][i] == 1)
                {
                    assign_address ++;
                    area = 1;
                    dfs(ii, i, map_array, width, height);
                    picture_num.add(area);
                }
            }
        }
            
        //그림이 없는경우 0 출력
        picture_num.add(0);
        
        //정답 출력
        int total_village = assign_address-1;
        bw.write(total_village+"\n");
        //정렬
		Collections.sort(picture_num);
        bw.write(picture_num.get(total_village)+"\n");
        bw.flush();
    }
    
    
    //DFS
    static void dfs(int n_xx, int n_yy, int[][] map_array, int width, int height) 
    {
        map_array[n_xx][n_yy] = assign_address;

        for(int i = 0; i < 4; i++) 
        {
            int horizontal_coord = n_xx+check_pathxx[i];
            int vertical_coord = n_yy+check_pathyy[i];

            //범위를 벗어난 경우 건너뜀, 그림이 없거나 이미 방문한 경우 건너뜀
            if (horizontal_coord >= 0 && horizontal_coord < width && vertical_coord >= 0 && vertical_coord < height && map_array[horizontal_coord][vertical_coord] == 1) 
            {
                area ++;
                
                //찾은 길을 기준으로 다음 위치를 탐색
                dfs(horizontal_coord, vertical_coord, map_array, width, height);
            }
        }
    }
}