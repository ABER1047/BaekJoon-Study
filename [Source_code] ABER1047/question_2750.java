import java.io.*;
import java.util.*;

public class question_2750 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        ArrayList<Integer> arr_list = new ArrayList<>();
        
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++)
        {
            arr_list.add(Integer.parseInt(br.readLine()));
        }
        
        Collections.sort(arr_list,Collections.reverseOrder());
        
        for(int i = 0; i < n; i++)
        {
            bw.write(arr_list.get(i)+"\n");
        }
        bw.flush();
    }
}
