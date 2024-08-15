import java.util.*;
import java.io.*;

public class question_1120 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String tmp_str[] = br.readLine().split(" ");
        char input1[] = tmp_str[0].toCharArray();
        char input2[] = tmp_str[1].toCharArray();
        
        int ans = 99, which_length_is_longer = 1;
        int length1 = input1.length, length2 = input2.length, dis = Math.abs(length1-length2);
        if (length1 > length2)
        {
            which_length_is_longer = 1;
        }
        else
        {
            which_length_is_longer = 2;
        }
        
        for(int ii = 0; ii <= dis; ii++)
         {
            int tmp_ans = 0;
            for(int i = 0; i < Math.min(length1, length2); i++)
            {
                if ((which_length_is_longer == 2 && input1[i] != input2[i+ii]) || (which_length_is_longer == 1 && input1[i+ii] != input2[i]))
                {
                    tmp_ans ++;
                }
            }
            
            ans = Math.min(ans, tmp_ans);
        }
        
        bw.write(ans+"\n");
        bw.flush();
    }
}