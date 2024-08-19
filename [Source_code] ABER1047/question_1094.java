import java.io.*;
import java.util.*;

public class question_1094
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int x = Integer.parseInt(br.readLine());
        
        int ans = 1, tmp_val = 0, start_length = 64;
        while(true)
        {
            if (x > tmp_val+start_length)
            {
                tmp_val += start_length;
                ans ++;
            }
            else if (x == tmp_val+start_length)
            {
                bw.write(ans+"\n");
                bw.flush();
                break;
            }
            else
            {
                start_length *= 0.5;
            }
        }
    }
}