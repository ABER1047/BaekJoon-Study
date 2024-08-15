import java.io.*;
import java.util.*;

public class question_2563
{
    static int n = 0, m = 0;

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int arr[][] = new int[100][100];
        int ans = 0;
        
        int paper_num = Integer.parseInt(br.readLine());
        for(int i = 0; i < paper_num; i++)
        {
            String tmp_str[] = br.readLine().split(" ");
            int xstart = Integer.parseInt(tmp_str[0]), ystart = Integer.parseInt(tmp_str[1]);
            for(int k = 0; k < 10; k++)
            {
                for(int kk = 0; kk < 10; kk++)
                {
                    int dx = xstart+kk, dy = ystart+k;
                    if (arr[dy][dx] != 1)
                    {
                        ans ++;
                        arr[dy][dx] = 1;
                    }
                }
            }
        }
        
        bw.write(ans+"\n");
        bw.flush();
    }
}
