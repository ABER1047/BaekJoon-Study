import java.util.*;
import java.io.*;

public class question_2941
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String tmp_str = br.readLine();
        String pattern[] = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
        
        int ans = 0;
        while(true)
        {
            boolean no_alphabet = true;
            for(int i = 0; i < pattern.length; i++)
            {
                if (tmp_str.contains(pattern[i]))
                {
                    no_alphabet = false;
                    tmp_str = tmp_str.replace(pattern[i], " ");
                    //System.out.println(tmp_str);
                }
            }
            
            if (no_alphabet)
            {
                ans += tmp_str.length();
                break;
            }
        }

        bw.write(ans+"\n");
        bw.flush();
    }
}