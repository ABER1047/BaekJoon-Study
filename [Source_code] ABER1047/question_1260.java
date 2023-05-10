import java.io.*;
import java.util.*;

public class question_1260 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str1 = br.readLine().split(" ");
        int temp0 = Integer.parseInt(str1[0])+1;
        int temp1 = Integer.parseInt(str1[1]);
        int map_array[][] = new int[temp0][temp0];
        boolean visited1[] = new boolean[temp0];
        boolean visited2[] = new boolean[temp0];

        for(int i = 0; i < temp1; i++) 
        {
            String[] str2 = br.readLine().split(" ");
            int from = Integer.parseInt(str2[0]);
            int to = Integer.parseInt(str2[1]);
            //양방향 그래프이므로 반대쪽도 연결해주기
            map_array[from][to] = 1;
            map_array[to][from] = 1;
        }

        //시작 지점
        int xx = Integer.parseInt(str1[2]);
        
        bw.write(dfs(xx,map_array,visited1));
        bw.write("\n");
        bw.write(bfs(xx,map_array,visited2));
        bw.write("\n");
        bw.flush();
    }

    static String dfs(int xx, int[][] map_array, boolean[] visited) 
    {
        //출력 용도
        StringBuilder sb = new StringBuilder();
        sb.append(xx+" ");
        

        visited[xx] = true;
        for(int i = 1; i < map_array.length; i++) 
        {
            if(map_array[xx][i] == 1 && !visited[i]) 
            {
                dfs(i,map_array,visited,sb);
            }
        }
        return sb.toString();
    }

    static String bfs(int xx, int[][] map_array, boolean[] visited) 
    {
        //출력 용도
        StringBuilder sb = new StringBuilder();
        
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(xx);
        visited[xx] = true;

        while(!queue.isEmpty()) 
        {
            int nodeIndex = queue.poll();
            sb.append(nodeIndex+" ");
            for(int i = 1; i < map_array.length; i++) 
            {
                if(map_array[nodeIndex][i] == 1 && !visited[i]) 
                {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
        return sb.toString();
    }
}
