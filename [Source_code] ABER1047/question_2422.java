import java.util.*;
import java.io.*;
import java.lang.*;

public class question_2422 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] tmp_str = br.readLine().split(" ");
        int inputs[] = new int[2];
        for(int i = 0; i < 2; i++)
        {
            inputs[i] = Integer.parseInt(tmp_str[i]);
            
            // [0] - 아이스크림 종류
            // [1] - 섞어먹으면 안되는 조합의 갯수
        }
        
        //섞으면 안되는 조합
        Set<String> fail_comb = new HashSet<>();
        for(int i = 0; i < inputs[1]; i++)
        {
            String tmp[] = br.readLine().split(" ");
            fail_comb.add(tmp[0]+","+tmp[1]);
            fail_comb.add(tmp[1]+","+tmp[0]);
        }
        
        
        int ans = 0;
        for(int i = 1; i <= inputs[0]-2; i++)
        {
            for(int ii = i+1; ii <= inputs[0]-1; ii++)
            {
                for(int iii = ii+1; iii <= inputs[0]; iii++)
                {
                    String pair1 = i + "," + ii;
                    String pair2 = ii + "," + iii;
                    String pair3 = iii + "," + i;
                    
                    if (!fail_comb.contains(pair1) && !fail_comb.contains(pair2) && !fail_comb.contains(pair3))
                    {
                        ans ++;
                        //bw.write(i + " " + ii + " " + iii + "\n");
                    }
                }
            }
        }
        
        bw.write(ans + "\n");
        bw.flush();
    }
}
