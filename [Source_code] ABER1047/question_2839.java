import java.util.*;
import java.io.*;

public class question_2839 
{
    public static void main(String[] args) throws IOException
    {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int kg = Integer.parseInt(br.readLine());
        
        int ans = kg/5;
        int left_kg = kg%5;
        while(left_kg%3 != 0)
        {
            ans --;
            left_kg += 5;
            
            if (ans < 0)
            {
                ans = -1;
                left_kg = 0;
                break;
            }
        }
        
        ans += left_kg/3;
        
        
        bw.write(ans+"\n");
        bw.flush();
    }
}
