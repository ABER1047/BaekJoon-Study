import java.io.*;
import java.util.*;

public class ladixSort
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        String arr[] = new String[num];
        int max_digit_num = 0;
        for(int i = 0; i < num; i++)
        {
            arr[i] = br.readLine();
            max_digit_num = Math.max(max_digit_num,arr[i].length());
        }
        
        Queue<String>[] queue = new Queue[10];
        for(int i = 0; i < 10; i++)
        {
            queue[i] = new LinkedList<>();
        }
        
        // 각 문자열을 max_digit_num 길이로 맞추기 (앞에 '0'을 추가)
        for(int i = 0; i < num; i++) 
        {
            while(arr[i].length() < max_digit_num) 
            {
                arr[i] = "0" + arr[i];
            }
        }
        
        
        for(int i = max_digit_num-1; i >= 0; i--)
        {
            for(int ii = 0; ii < num; ii++)
            {
                int digit = (int) arr[ii].charAt(i) - (int) '0';
                queue[digit].add(arr[ii]);
            }
            
            
            int index = 0;
            for(int ii = 9; ii >= 0; ii--)
            {
                while(!queue[ii].isEmpty())
                {
                    arr[index++] = queue[ii].remove();
                }
            }
        }
        
        for(int i = 0; i < num; i++)
        {
            bw.write(Integer.parseInt(arr[i])+"\n");
        }
        bw.flush();
    }
}