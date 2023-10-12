import java.util.*;
import java.io.*;

public class question_1620
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str[] = br.readLine().split(" ");
        int stack_size = Integer.parseInt(str[0]);
        
        
        HashMap<String, Integer> map = new HashMap<>();
        String value_to_key[] = new String[stack_size];
        
    
        for(int i = 0; i < stack_size; i++)
        {
            String tmp_str = br.readLine();
            map.put(tmp_str,i);
            value_to_key[i] = tmp_str;
        }
        
        for(int i = 0; i < Integer.parseInt(str[1]); i++)
        {
            String str_tmp = br.readLine();
            if (map.containsKey(str_tmp))
            {
                bw.write((map.get(str_tmp)+1)+"\n");
            }
            else
            {
                bw.write(value_to_key[Integer.parseInt(str_tmp)-1]+"\n");
            }
        }
        
        bw.flush();
    }
}
