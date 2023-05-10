import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int i = 0;
        short array[] = new short[n];
        
        for(; i < n; i++)
        {
            array[i] = Short.parseShort(br.readLine());
            Arrays.sort(array,0,i+1);
            bw.write(array[i/2]+"\n");
        }
        
        bw.flush();
        bw.close();
    }
}