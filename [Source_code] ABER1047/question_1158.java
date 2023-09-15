import java.util.*;
import java.io.*;

public class question_1158 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str[] = br.readLine().split(" ");
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for(int i = 0; i < Integer.parseInt(str[0]); i++)
        {
            arr.add(i+1);
        }
        
        bw.write("<");
        int index = 0;
        while(!arr.isEmpty())
        {
            index += Integer.parseInt(str[1])-1;
            while(index > 0 && index >= arr.size())
            {
                index -= arr.size();
            }
            bw.write(arr.remove(index)+(!arr.isEmpty() ? ", " : ">\n"));
        }
        bw.flush();
    }
}
