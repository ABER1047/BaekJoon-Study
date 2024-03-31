import java.util.*;
import java.io.*;

public class question_17626 
{
    public static void main(String[] args) throws IOException
    {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int target_num = Integer.parseInt(br.readLine());
        int sqrt_target_num = (int) Math.sqrt(target_num);
        int dp[] = new int[target_num];
        
        
        for(int i = 1; i <= sqrt_target_num; i++)
        {
            //dp값 저장
            dp[i] = dp[i-1]+1;
            
            for(int ii = 1; ii*ii <= i; ii++)
            {
                
            }
        }
        
        
        
        
        bw.write("\n");
        bw.flush();
    }
}
