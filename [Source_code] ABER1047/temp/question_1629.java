import java.util.*;
import java.io.*;

public class question_1629 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        String str[] = br.readLine().split(" ");
        
        int inputs[] = new int[3];
        for(int i = 0; i < 3; i++)
        {
            inputs[i] = Integer.parseInt(str[i]);
        }
        bw.write(remainder(inputs[0],inputs[1],inputs[2])+"\n");
        bw.flush();
    }
    
    static int remainder(int A, int B, int C)
    {
        int _cal = remainder(A,B/2,C);
        if (B == 1)
        {
            return A;
        }
        else if (B%2 == 0)
        {
            return _cal*_cal%C;
        }
        else if (B%2 == 1)
        {
            return A*_cal*_cal%C;
        }
        
        return 0;
    } 
}
