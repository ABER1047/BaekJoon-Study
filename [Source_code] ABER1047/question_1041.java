import java.io.*;
import java.util.*;

public class question_1041 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> deleted_queue = new ArrayList<Integer>();
        int test_case = Integer.parseInt(br.readLine());
        int dx[] = {-1,0,1,0};
        int dy[] = {0,1,0,-1};
        for(int repeat = 0; repeat < test_case; repeat++)
        {
            int width = Integer.parseInt(br.readLine());
            String[] temp1 = br.readLine().split(" ");
            String[] temp2 = br.readLine().split(" ");
            int map[][] = new int[width][2];
            int ans = 0;
            
            for(int i = 0; i < width; i++)
            {
                map[i][0] = Integer.parseInt(temp1[i]);
                map[i][1] = Integer.parseInt(temp2[i]);
            }
            
            for(int i = 0; i < 2; i++)
            {
                for(int ii = 0; ii < width; ii++)
                {
                    if (map[ii][i] != 0)
                    {
                        int expected_value = 0;
                    
                        for(int search = 0; search < 4; search++)
                        {
                            int target_xx = ii+dx[search];
                            int target_yy = i+dy[search];
                            if (target_xx >= 0 && target_yy >= 0 && target_xx < width && target_yy < 2 && map[target_xx][target_yy] != 0)
                            {
                                expected_value += map[target_xx][target_yy];
                                deleted_queue.add(target_xx);
                                deleted_queue.add(target_yy);
                            }
                        }
                    
                        
                        if (expected_value < map[ii][i])
                        {
                            ans += map[ii][i];
                            map[ii][i] = 0;
                            for(int j = 0; j < deleted_queue.size(); j += 2)
                            {
                                map[deleted_queue.get(j)][deleted_queue.get(j+1)] = 0;
                            }
                            i = 0;
                            ii = 0;
                            deleted_queue.clear();
                        }
                    }
                }
            }
            
            bw.write(ans+"\n");
        }
        
        
        bw.flush();
    }
}
