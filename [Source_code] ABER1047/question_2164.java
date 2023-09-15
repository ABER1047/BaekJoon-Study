import java.util.*;
import java.io.*;

public class question_2164 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Deque<Integer> dq = new LinkedList<Integer>();
        
        int card_num = Integer.parseInt(br.readLine());
        for(int i = 0; i < card_num; i++)
        {
            dq.add(i+1);
        }
        
        while(arr.size() > 1)
        {
            dq.poll();
            dq.add(dq.poll());
        }
        
        bw.write(dq.peek()+"\n");
        bw.flush();
    }
}
