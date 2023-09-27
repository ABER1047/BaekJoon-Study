import java.util.*;
import java.io.*;

public class question_1935 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int arg_num = Integer.parseInt(br.readLine());
        char inputs[] = br.readLine().toCharArray();
        String result[] = new String[inputs.length];
        ArrayList<Float> arr = new ArrayList<>();
        
        int num_index = 0;
        int operator_index = 0;
        float parameter[] = new float[arg_num+1];

        //파라미터값 받아오기
        parameter[0] = 0;
        for(int i = 1; i < arg_num+1; i++)
        {
            parameter[i] = Integer.parseInt(br.readLine());
        }
        
        
        //결과 식 세우기 (곱하기 나누기는 이때 먼저 계산)
        for(int i = 0; i < inputs.length; i++)
        {
            if (inputs[i] == '+' || inputs[i] == '-' || inputs[i] == '*' || inputs[i] == '/')
            {
                if (inputs[i] == '*')
                {
                    float tmp_val = parameter[(int) result[operator_index*2-2].charAt(0)-64]*parameter[(int) result[operator_index*2].charAt(0)-64];
                    arr.add(tmp_val);
                    result[operator_index*2] = "@";
                    result[operator_index*2-2] = "@";
                    result[operator_index*2-1] = "+";
                }
                else if (inputs[i] == '/')
                {
                    float tmp_val = parameter[(int) result[operator_index*2-2].charAt(0)-64]/parameter[(int) result[operator_index*2].charAt(0)-64];
                    arr.add(tmp_val);
                    result[operator_index*2] = "@";
                    result[operator_index*2-2] = "@";
                    result[operator_index*2-1] = "+";
                }
                else
                {
                    result[operator_index*2-1] = Character.toString(inputs[i]);
                }
                operator_index --;
            }
            else
            {
                result[num_index*2] = Character.toString(inputs[i]);
                operator_index = num_index;
                num_index ++;
            }
        }
        
        //식 계산
        float ans = parameter[(int) result[0].charAt(0)-64];
        for(int i = 1; i < inputs.length-1; i += 2)
        {
            System.out.print(result[i-1]+" "+result[i]+" ");
            if (result[i].charAt(0) == '+')
            {
                ans += parameter[(int) result[i+1].charAt(0)-64];
            }
            else
            {
                ans -= parameter[(int) result[i+1].charAt(0)-64];
            }
        }
        
        System.out.print(arr);
        System.out.printf("%.2f",ans);
    }
}
