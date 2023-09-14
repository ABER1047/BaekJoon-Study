import java.util.*;
import java.io.*;

public class question_10828 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Stack st = new Stack();
        
        int repeat_num = Integer.parseInt(br.readLine());
        for(int i = 0; i < repeat_num; i++)
        {
            String input_str[] = br.readLine().split(" ");
            if (input_str[0].equals("push"))
            {
                st.push(Integer.parseInt(input_str[1]));
            }
            else if (input_str[0].equals("pop"))
            {
                if (st.isEmpty())
                {
                    bw.write("-1\n");
                }
                else
                {
                    bw.write(st.pop()+"\n");
                }
            }
            else if (input_str[0].equals("top"))
            {
                if (st.isEmpty())
                {
                    bw.write("-1\n");
                }
                else
                {
                    bw.write(st.peek()+"\n");
                }
            }
            else if (input_str[0].equals("size"))
            {
                bw.write(st.size()+"\n");
            }
            else if (input_str[0].equals("empty"))
            {
                bw.write(((st.isEmpty() == true) ? 1 : 0)+"\n");
            }
        }

        bw.flush();
    }
}
