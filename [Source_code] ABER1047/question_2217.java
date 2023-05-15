import java.util.*;
import java.io.*;

public class question_2217 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        ArrayList<Integer> rope = new ArrayList<Integer>();
        
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++)
        {
            rope.add(Integer.parseInt(br.readLine()));
        }
        
        Collections.sort(rope,Collections.reverseOrder());
        
        int ans = rope.get(0);
        for(int i = 1; i < n; i++)
        {
            int get_value = rope.get(i)*(i+1);
            ans = (get_value > ans) ? get_value : ans;
        }
        
        
        bw.write(ans+"\n");
        bw.flush();
        bw.close();
    }
}
