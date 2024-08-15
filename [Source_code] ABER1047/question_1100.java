import java.util.*;
import java.io.*;

public class question_1100
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int ans = 0;
        char map[][] = new char[8][8];
        for(int i = 0; i < 8; i++)
        {
            map[i] = br.readLine().toCharArray();
            
            for(int ii = 0; ii < 8; ii++)
            {
                if (i%2 == 0)
                {
                    if (ii%2 == 0 && map[i][ii] == 'F')
                    {
                        ans ++;
                    }
                }
                else
                {
                    if (ii%2 == 1 && map[i][ii] == 'F')
                    {
                        ans ++;
                    }
                }
            }
        }
        
        bw.write(ans+"\n");
        bw.flush();
    }
}