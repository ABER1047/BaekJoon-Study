import java.util.*;
import java.io.*;

public class question_1157
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        int str[] = new int[(int)'z' - (int)'a'+1];
        
        char input[] = br.readLine().toLowerCase().toCharArray();
        
        for(int i = 0; i < input.length; i++)
        {
            str[(int)input[i] - (int)'a'] += 1;
        }
        
        char tmp_ans = '?';
        int max_cnt = -1;
        for(int i = 0; i < str.length; i++)
        {
            if (max_cnt < str[i])
            {
                max_cnt = str[i];
                tmp_ans = Character.toUpperCase((char)((int)'a'+i));
            }
            else if (max_cnt == str[i])
            {
                tmp_ans = '?';
            }
        }
        
        bw.write(tmp_ans+"\n");
        bw.flush();
    }
}