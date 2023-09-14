import java.util.*;
import java.io.*;

public class question_9012 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        int repeat_num = Integer.parseInt(br.readLine());
        for(int i = 0; i < repeat_num; i++)
        {
            int is_VPS = 0;
            String input_str = br.readLine();
            char c_arr[] = input_str.toCharArray();
            
            for(int ii = 0; ii < input_str.length(); ii++)
            {
                if (c_arr[ii] == '(')
                {
                    is_VPS ++;
                }
                else if (c_arr[ii] == ')')
                {
                    is_VPS --;
                    if (is_VPS < 0)
                    {
                        break;
                    }
                }
            }
            
            if (is_VPS == 0)
            {
                bw.write("YES\n");
            }
            else
            {
                bw.write("NO\n");
            }
        }
        
        
        bw.flush();
    }
}
