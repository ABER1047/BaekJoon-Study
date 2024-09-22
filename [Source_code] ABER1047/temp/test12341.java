import java.util.*;
import java.io.*;

public class test12341
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char tmp_hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        char tmp_char[] = br.readLine().toCharArray();
        double ans = 0;
        for(int i = tmp_char.length-1; i >= 0; i--)
        {
            for(int ii = 0; ii < 16; ii++)
            {
                if (tmp_char[i] == tmp_hex[ii])
                {
                    ans += ii*Math.pow(16,tmp_char.length-i-1);
                    break;
                }
            }
        }
        
        bw.write(((int) ans)+"\n");
        bw.flush();
    }
}