import java.io.*;
import java.util.*;

public class question_2178_2
{
    static int n = 0, m = 0;

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
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
        bfs(map_array, 0, 0);
    }
    
    
    
    //bfs
    static void bfs(int[][] map_array, int n_x, int n_y) throws IOException
    {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        //큐를 생성
		Queue<Integer> queue = new LinkedList<Integer>();
    
        //시작노드 방문처리
		map_array[n_x][n_y] = 0;
        
        //큐에 BFS를 시작 할 좌표 넣기
		queue.offer(n_x);
        queue.offer(n_y);
        
        int dx[] = {1,0,-1,0};
        int dy[] = {0,-1,0,1};
        int n_passed_num = 0, t_xx = 0, t_yy = 0;
		
		//큐가 빌 때까지 반복
        loop:
		while(!queue.isEmpty()) 
        {
            int xx_node = queue.poll();
            int yy_node = queue.poll();
            
            //큐에서 꺼낸 노드와 연결된 노드들 체크
			for(int i = 0; i < dx.length; i++) 
            {
                t_xx = xx_node+dx[i];
                t_yy = yy_node+dy[i];
                
				//방문하지 않았으면 방문처리 후 큐에 넣기
				if (t_xx >= 0 && t_xx < m && t_yy >= 0 && t_yy < n)
                {
                    if (map_array[t_xx][t_yy] == 1)
                    {
                        //지나온 길의 값을 기준으로, 최단 거리 구하기
                        map_array[t_xx][t_yy] += map_array[xx_node][yy_node];
                        queue.offer(t_xx);
                        queue.offer(t_yy);
                    }
                    
                    if (t_xx == m-1 && t_yy == n-1) 
                    {
                        break loop;
                    }
				}
			}
        }
        
        //정답 출력
        //처음 지나온길 1칸 = +1만큼 더해주기
        bw.write((map_array[t_xx][t_yy]+1)+"\n");
        bw.flush();
        bw.close();
    }
}
