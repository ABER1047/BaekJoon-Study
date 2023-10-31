import java.io.*;
import java.util.*;

public class question_10799 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        char input[] = br.readLine().toCharArray();
        
        
        int ans = 0;
        int tmp_num = 0;
        for(int i = 0; i < input.length; i++)
        {
            if (input[i] == '(')
            {
                ans += tmp_num;
                tmp_num++;
            }
            else
            {
                tmp_num--;
            }
        }
        
        bw.write(ans+"\n");
        bw.flush();
    }    
}
