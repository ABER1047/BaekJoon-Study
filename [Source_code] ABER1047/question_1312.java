import java.io.*;

public class question_1312 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input[] = br.readLine().split(" ");
        
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int N = Integer.parseInt(input[2]);
        
        // 소숫점 아래 자리수를 구하기 위해 분자를 10으로 곱합니다.
        int result = 0;
        A = A % B;
        
        for (int i = 0; i < N; i++) 
        {
            A *= 10;
            result = A / B;
            A = A % B;
        }
        
        // 최종적으로 N번째 자리의 수를 출력합니다.
        bw.write(result+"\n");
        bw.flush();
    }
}
