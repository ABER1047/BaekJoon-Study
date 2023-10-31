import java.util.*;
import java.io.*;

public class question_14425 
{
    public static void main(String[] args) throws IOException
    {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        HashMap<String, Integer> map = new HashMap<>();
        
        String tmp_str[] = br.readLine().split(" ");
        int n = Integer.parseInt(tmp_str[0]);
        int m = Integer.parseInt(tmp_str[1]);
        int ans = 0;
        
        for(int i = 0; i < n; i++)
        {
            map.put(br.readLine(), 1);
        }
        
        for(int i = 0; i < m; i++)
        {
            String tmp = br.readLine();
            if (map.containsKey(tmp))
            {
                ans += map.get(tmp);
            }
        }
        
        bw.write(ans+"\n");
        bw.flush();
    }
}
