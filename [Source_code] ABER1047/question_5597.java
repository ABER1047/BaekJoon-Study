import java.util.*;
import java.io.*;

public class question_5597
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //배열 선언
        int cnt[] = new int[30];
        
        
        for(int i = 0; i < 28; i++)
        {
            //인풋 값 (= 출석 번호)
            int input = Integer.parseInt(br.readLine());
            
            //출석 번호가 불림 (= 해당 출석 번호에 해당하는 배열 자리를 1로 변경 - 0인 곳은 아직 출석이 안 불린 자리)
            cnt[input-1] = 1;
        }
        
        for(int i = 0; i < 30; i++)
        {
            //0인 곳 (= 출석 번호가 안 불린 곳) 체크해서 안 불린 번호들 출력
            if (cnt[i] != 1)
            {
                bw.write((i+1)+"\n");
            }
        }
        
        bw.flush();
    }
}