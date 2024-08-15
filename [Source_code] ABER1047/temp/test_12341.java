import java.io.*;
import java.util.*;

public class test_12341 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str[] = br.readLine().split(" ");
        int val0 = Integer.parseInt(str[0]), val1 = Integer.parseInt(str[1]), val2 = Integer.parseInt(str[2]);
        
        if (val0 == val1 && val1 == val2)
        {
            bw.write((10000+val0*1000)+"\n");
        }
        else if (val0 == val1)
        {
            bw.write((1000+val0*100)+"\n");
        }
        else if (val1 == val2 || val0 == val2)
        {
            bw.write((1000+val2*100)+"\n");
        }
        else
        {
            bw.write((Math.max(Math.max(val0,val1),val2)*100)+"\n");
        }
        
        bw.flush();
    }
}