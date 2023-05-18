import java.util.*;
import java.io.*;

public class question_20300 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        ArrayList<Long> loss = new ArrayList<Long>();
        
        int n = Integer.parseInt(br.readLine());
        
        String str[] = br.readLine().split(" ");
        for(int i = 0; i < n; i++)
        {
            loss.add(Long.parseLong(str[i]));
        }
        
        Collections.sort(loss);
        long ans = 0;
        if (n%2 == 0)
        {
            for(int i = 0; i < n/2; i++)
            {
                long cal = loss.get(i)+loss.get(n-i-1);
                if (ans < cal)
                {
                    ans = cal;
                }
            }
        }
        else
        {
            for(int i = 0; i < n/2; i++)
            {
                long cal = loss.get(i)+loss.get(n-i-2);
                if (ans < cal)
                {
                    ans = cal;
                }
            }
            
            long cal = loss.get(n-1);
            if (ans < cal)
            {
                ans = cal;
            }
        }
        
        
        bw.write(ans+"\n");
        bw.flush();
        bw.close();
    }
}
