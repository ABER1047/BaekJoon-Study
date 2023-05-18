import java.util.*;
import java.io.*;

public class question_1758
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        ArrayList<Integer> tips = new ArrayList<Integer>();
        
        int n = Integer.parseInt(br.readLine());
        long ans = 0;

        for(int i = 0; i < n; i++)
        {
            tips.add(Integer.parseInt(br.readLine()));
        }
        
        Collections.sort(tips,Collections.reverseOrder());
        for(int i = 0; i < n; i++)
        {
            int n_tips = tips.get(i)-i;
            ans += (n_tips < 0) ? 0 : n_tips;
        }
        
        bw.write(ans+"\n");
        bw.flush();
        bw.close();
    }
}