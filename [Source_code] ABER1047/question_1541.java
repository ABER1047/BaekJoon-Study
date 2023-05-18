import java.util.*;
import java.io.*;



public class question_1541 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        String str2 = str.replace("+", " ");
        str2 = str2.replace("-", " ");
        String numbers_string[] = str2.split(" ");
        int numbers[] = new int[numbers_string.length];
        //숫자 변환
        for(int i = 0; i < numbers_string.length; i++)
        {
            numbers[i] = Integer.parseInt(numbers_string[i]);
        }
        
        
        int operator_pos = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == '+')
            {
                operator_pos++;
            }
            else if (str.charAt(i) == '-')
            {
                break;
            }
        }
        
        
        int ans = 0;
        for(int i = 0; i <= operator_pos; i++)
        {
            ans += numbers[i];
        }
        
        for(int i = operator_pos+1; i < numbers.length; i++)
        {
            ans -= numbers[i];
        }

        bw.write(ans+"\n");
        bw.flush();
    }
}
