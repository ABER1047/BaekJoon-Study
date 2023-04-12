import java.io.*;

public class question_1316 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()), total_num = 0;
        
        String str[] = new String[N];
        
        for(short i = 0; i < N; i++)
        {
            str[i] = br.readLine();
            
            int str_length = str[i].length();
            short met_condition = 1;
            for(int ii = 0; ii < str_length-1; ii++)
            {
                met_condition = 1;
                int distance = str[i].indexOf(str[i].charAt(ii),ii+1)-ii;
                
                if (distance > 1)
                {
                    met_condition = 0;
                    break;
                }
            }
         
            total_num += met_condition;
        }
        
        
        bw.write(total_num+"\n");
        bw.flush();
    }
}
