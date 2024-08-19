import java.io.*;
import java.util.*;

//계수 정렬
public class question_10989
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // n 값을 입력받기
        int n = Integer.parseInt(br.readLine());

        // 계수 배열 초기화
        int counts[] = new int[n];

        // 입력값을 계수 배열에 기록
        for(int i = 0; i < n; i++) 
        {
            int value = Integer.parseInt(br.readLine());
            counts[value]++;
        }

        // 계수 배열을 바탕으로 정렬된 결과를 출력
        for(int i = 0; i < n; i++) 
        {
            while(counts[i] > 0) 
            {
                bw.write(i + "\n");
                counts[i]--;
            }
        }

        bw.flush();
    }
}