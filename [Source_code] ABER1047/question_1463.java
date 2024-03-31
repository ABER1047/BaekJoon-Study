import java.util.*;
import java.io.*;

public class question_1463
{
    public static void main(String[] args) throws IOException
    {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int target_num = Integer.parseInt(br.readLine());

        int dp[] = new int[target_num+1];
        
        for(int i = 2; i <= target_num; i++)
        {
            //1빼기
            dp[i] = dp[i-1]+1;
            
            //2로 나누어지는 경우
            if (i%2 == 0)
            {
                dp[i] = Math.min(dp[i],dp[i/2]+1);
            }
            
            if (i%3 == 0)
            {
                dp[i] = Math.min(dp[i],dp[i/3]+1);
            }
        }
        
        
        
        
        
        bw.write(dp[target_num]+"\n");
        bw.flush();
    }
}
