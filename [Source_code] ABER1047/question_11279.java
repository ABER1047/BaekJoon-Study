import java.util.*;
import java.io.*;

public class question_11279 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        PriorityQueue<Integer> pri_q = new PriorityQueue<>(Collections.reverseOrder());
        
        int num = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < num; i++)
        {
            int tmp_input = Integer.parseInt(br.readLine());
            
            if (tmp_input == 0)
            {
                bw.write((pri_q.isEmpty()) ? "0\n" : pri_q.poll()+"\n");
            }
            else
            {
                pri_q.add(tmp_input);
            }
        }
        
        bw.flush();
    }
}
