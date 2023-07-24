import java.io.*;
import java.math.*;

public class question_2407
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String temp[] = br.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int R = Integer.parseInt(temp[1]);
        int temp_val = N-R;
        
        if (temp_val < R)
        {
            R = temp_val;
            temp_val = N-R;
        }
        
        BigInteger ans = new BigInteger("1");
        for(int i = R+1; i <= N; i++)
        {
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        

        for(int i = temp_val; i > 1; i--)
        {
            ans = ans.divide(BigInteger.valueOf(i));
        }
        
        bw.write(ans.toString()+"\n");
        bw.flush();
    }
}
