import java.io.*;
import java.util.*;

public class question_10866 
{
    public static void main(String[] args) throws IOException
    {
        Deque dq = new LinkedList<Integer>();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int total_input = Integer.parseInt(br.readLine());
        for(int i = 0; i < total_input; i++)
        {
            String str[] = br.readLine().split(" ");
            if (str[0].equals("push_front"))
            {
                dq.addFirst(Integer.parseInt(str[1]));
            }
            else if (str[0].equals("push_back"))
            {
                dq.addLast(Integer.parseInt(str[1]));
            }
            else if (str[0].equals("pop_front"))
            {
                bw.write((dq.isEmpty() ? -1 : dq.pollFirst())+"\n");
            }
            else if (str[0].equals("pop_back"))
            {
                bw.write((dq.isEmpty() ? -1 : dq.pollLast())+"\n");
            }
            else if (str[0].equals("size"))
            {
                bw.write((dq.size())+"\n");
            }
            else if (str[0].equals("empty"))
            {
                bw.write((dq.isEmpty() ? 1 : 0)+"\n");
            }
            else if (str[0].equals("front"))
            {
                bw.write((dq.isEmpty() ? -1 : dq.peekFirst())+"\n");
            }
            else if (str[0].equals("back"))
            {
                bw.write((dq.isEmpty() ? -1 : dq.peekLast())+"\n");
            }
        }
        
        bw.flush();
    }
}
