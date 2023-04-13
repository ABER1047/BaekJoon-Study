import java.io.*;

public class question_11047 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input[] = br.readLine().split(" ");
        
        int n = Integer.parseInt(input[0]), target_value = Integer.parseInt(input[1]);
        int value_array[] = new int[n], ans = 0, i = 0;
        
                
        for(; i < n; i++)
        {
            value_array[i] = Integer.parseInt(br.readLine());
        }
        
        

        for(i = n-1; i >= 0; i--)
        {
            while(true)
            {
                if (value_array[i] <= target_value && target_value != 0)
                {
                    target_value -= value_array[i];
                    ans ++;
                }
                else
                {
                    break;
                }
            }
        }

        
        bw.write(ans+"\n");
        bw.flush();
    }    
}
