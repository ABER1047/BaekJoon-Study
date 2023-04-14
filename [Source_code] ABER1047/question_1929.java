import java.io.*;
import java.lang.*;

public class question_1929 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str[] = br.readLine().split(" ");
        int m = Integer.parseInt(str[0]), M = Integer.parseInt(str[1]);
        
        int ii = 2;
        for(int i = (m == 1) ? 2 : m; i <= M; i++)
        {
            ii = 2;
            while(true)
            {
                if (ii <= Math.sqrt(i))
                {
                    if(i%ii == 0)
                    {
                    break;
                    }
                    else
                    {
                        ii++;
                    }
                }
                else
                {
                    bw.write(i+"\n");
                    break;
                }
            }
        }
        
        bw.flush();
    }
}
