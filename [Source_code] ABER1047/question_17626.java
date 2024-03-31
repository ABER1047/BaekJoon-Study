import java.util.*;
import java.io.*;

public class question_17626 
{
    public static void main(String[] args) throws IOException
    {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int target_num = Integer.parseInt(br.readLine());
        int dp[] = new int[target_num+1];
        dp[1] = 1;
        
        for(int i = 2; i <= target_num; i++)
        {
            //현재 값이 이전 단계 값의 +1횟수니까
            dp[i] = dp[i-1]+1;
            
            for(int ii = 1; ii*ii <= i; ii++)
            {
                dp[i] = Math.min(dp[i],dp[i - ii*ii]+1);
            }
        }
        
        bw.write(dp[target_num]+"\n");
        bw.flush();
    }
}
