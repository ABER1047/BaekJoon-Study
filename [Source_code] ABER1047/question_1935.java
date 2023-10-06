import java.util.*;
import java.io.*;

public class question_1935 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int arg_num = Integer.parseInt(br.readLine());
        String inputs = br.readLine();
        Deque<Double> dq = new LinkedList<Double>();

        double parameter[] = new double[arg_num];

        //파라미터값 받아오기
        parameter[0] = 0;
        for(int i = 0; i < arg_num; i++)
        {
            parameter[i] = Integer.parseInt(br.readLine());
        }
        
        
        double ans = 0;
        for(int i = 0; i < inputs.length(); i++) 
        {
            if(inputs.charAt(i) >= 65 && inputs.charAt(i) < 100) 
            {
                dq.push(parameter[inputs.charAt(i)-65]);
            } 
            else 
            {
                if(!dq.isEmpty()) 
                {
                    double first = dq.pop();
                    double second = dq.pop();
                    char tmp_char = inputs.charAt(i);
                    if (tmp_char == '+')
                    {
                        ans = second + first;
                        dq.push(ans);
                    }
                    else if (tmp_char == '-')
                    {
                        ans = second-first;
                        dq.push(ans);
                    }
                    else if (tmp_char == '*')
                    {
                        ans = second*first;
                        dq.push(ans);
                    }
                    else
                    {
                        ans = second/first;
                        dq.push(ans);
                    }
                }
            }
        }
        System.out.printf("%.2f",+ans);
    }
}
