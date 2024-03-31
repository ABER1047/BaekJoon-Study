import java.io.*;
import java.util.*;

public class question_9655
{
    public static void main(String[] args) throws IOException
    {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int stone_num = Integer.parseInt(br.readLine());
        
        //상근이가 먼저 시작 (마지막 돌 가져가는 사람이 승리)
        //1개 or 3개만 돌 가져갈 수 있음
        if (stone_num%2 == 0)
        {
            bw.write("CY");
        }
        else
        {
            bw.write("SK");
        }
        
        
        bw.write("\n");
        bw.flush();
    }    
}
