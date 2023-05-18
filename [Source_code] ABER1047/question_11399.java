import java.util.*;
import java.io.*;

public class question_11399
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        ArrayList<Integer> time_array = new ArrayList<Integer>();
        
        int n = Integer.parseInt(br.readLine());
        int ans = 0;

        
        String str[] = br.readLine().split(" ");
        for(int i = 0; i < n; i++)
        {
            time_array.add(Integer.parseInt(str[i]));
        }
        
        Collections.sort(time_array);
        
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum += time_array.get(i);
            ans += sum;
        }
        
        bw.write(ans+"\n");
        bw.flush();
        bw.close();
    }
}