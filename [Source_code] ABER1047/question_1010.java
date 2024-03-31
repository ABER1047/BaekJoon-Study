import java.util.*;
import java.io.*;

public class question_1010 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //테스트 케이스
        int T = Integer.parseInt(br.readLine());
        
        
        for(int i = 0; i < T; i++)
        {
            long ans = 1;
            String tmp_str[] = br.readLine().split(" ");
            
            //서쪽 강 = N
            int N = Integer.parseInt(tmp_str[0]);
            
            //동쪽 강 = M (N <= M)
            int M = Integer.parseInt(tmp_str[1]);
            
            
            if (M-N > N)
            {
                N = M-N;
            }
            //bw.write("N : "+N+" / M : "+M+"\n");
                
            
            for(var ii = M; ii > N; ii--)
            {
                ans *= ii;
            }
            //bw.write("ans1 : "+ans+"\n");
            
            for(var ii = M-N; ii > 1; ii--)
            {
                ans /= ii;
            }
            //bw.write("ans2 : "+ans+"\n");
            
            bw.write(ans+"\n");
        }
        
        bw.flush();
    }    
}
