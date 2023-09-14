import java.util.*;
import java.io.*;

public class question_18258 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Deque<Integer> queue = new LinkedList<Integer>();
        
        
        int repeat_num = Integer.parseInt(br.readLine());
        for(int i = 0; i < repeat_num; i++)
        {
            String input_str[] = br.readLine().split(" ");
            if (input_str[0].equals("push"))
            {
                queue.add(Integer.parseInt(input_str[1]));
            }
            else if (input_str[0].equals("pop"))
            {
                bw.write((queue.isEmpty() ? -1 : queue.poll())+"\n");
            }
            else if (input_str[0].equals("size"))
            {
                bw.write(queue.size()+"\n");
            }
            else if (input_str[0].equals("empty"))
            {
                bw.write((queue.isEmpty() ? 1 : 0)+"\n");
            }
            else if (input_str[0].equals("front"))
            {
                bw.write((queue.isEmpty() ? -1 : queue.peekFirst())+"\n");
            }
            else if (input_str[0].equals("back"))
            {
                bw.write((queue.isEmpty() ? -1 : queue.peekLast())+"\n");
            }
        }
    
        bw.flush();
    }
}
