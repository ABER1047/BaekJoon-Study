import java.io.*;
import java.util.*;

public class question_1018
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        int arr[] = new int[(num < 6) ? 6 : num];
        for(int i = 0; i < num; i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        
        int ans = arr.length;
        for(int i = 0; i < arr.length-4; i++)
        {
            int tmp_needs = 0;
            int start_num = arr[i], index = 0;
            for(int ii = 0; ii < 5; ii++)
            {
                if (Math.abs(arr[i+index]-start_num+ii) == 1)
                {
                    index ++;
                }
                else
                {
                    tmp_needs ++;
                }
            }
            
            ans = Math.min(tmp_needs,ans);
            bw.write(tmp_needs+"/"+ans+"\n");
        }

        
        for(int i = 0; i < arr.length; i++)
        {
            bw.write(arr[i]+" ");
        }
        bw.write("\n");
        bw.write(ans+"\n");
        bw.flush();
    }
}
