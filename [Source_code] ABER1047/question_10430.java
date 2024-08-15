import java.util.*;
import java.io.*;

public class question_10430 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] input = br.readLine().split(" ");
        int input_real[] = new int[input.length];
        for(int i = 0; i < input.length; i++)
        {
            input_real[i] = Integer.parseInt(input[i]);
        }
        
        int tmp_cal1 = (input_real[0]%input_real[2]), tmp_cal2 = (input_real[1]%input_real[2]);
        
        
        int cal[] = new int[4];
        cal[0] = (input_real[0]+input_real[1])%input_real[2];
        cal[1] = (tmp_cal1+tmp_cal2)%input_real[2];
        
        cal[2] = (input_real[0]*input_real[1])%input_real[2];
        cal[3] = (tmp_cal1*tmp_cal2)%input_real[2];
        
        for(int i = 0; i < cal.length; i++)
        {
            bw.write(cal[i]+"\n");
        }
        bw.flush();
    }
}
