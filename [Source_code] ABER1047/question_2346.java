import java.util.*;
import java.io.*;

public class question_2346 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        //문제 정보 받아오기
        int tmp = Integer.parseInt(br.readLine());
        int arr[] = new int[tmp];
        String str[] = br.readLine().split(" ");
        for(int i = 0; i < tmp; i++)
        {
            arr[i] = Integer.parseInt(str[i]);
        }
        
        
        int n_pos = 0;
        bw.write(1+" ");
        for(int k = 0; k < tmp-1; k++)
        {
            int to_go = arr[n_pos], to_go_more = 0;
            arr[n_pos] = 0;

            for(int i = 1; i <= Math.abs(to_go+to_go_more); i++)
            {
                int sign_to_go = to_go/Math.abs(to_go);// =sign(to_go)와 같은 값
                int tmp_index = n_pos+i*sign_to_go;
                
                loop_inner:
                while(true)
                {
                    if (tmp_index >= arr.length)
                    {
                        tmp_index -= arr.length;
                    }
                    else if (tmp_index < 0)
                    {
                        tmp_index += arr.length;
                    }
                    else
                    {
                        break loop_inner;
                    }
                }
                
                if (arr[tmp_index] == 0)
                {
                    to_go_more += sign_to_go;
                }
                else
                {
                    if (i == Math.abs(to_go+to_go_more))
                    {
                        n_pos = tmp_index;
                        bw.write((n_pos+1)+" ");
                    }
                }
            }
        }
        
        
        bw.write("\n");
        bw.flush();
    }
}
