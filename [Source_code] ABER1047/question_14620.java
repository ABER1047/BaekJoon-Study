import java.io.*;

public class question_14620
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //input values
        int n = Integer.valueOf(br.readLine()), i = 0, ii = 0;
        int[][] place_price = new int[n][n];
        

        for(i = 0; i < n; i++)
        {
            String[] str = br.readLine().split(" ");
            for(ii = 0; ii < n; ii++)
            {
                place_price[ii][i] = Integer.valueOf(str[ii]);
            }
        }
        
        //find best place
        int saved_xx = -4, saved_yy = -4, saved_price[] = {0,0,0}, n_place_value = 0;
        for(int k = 0; k < 3; k++)
        {
            saved_xx = -4;
            for(i = 1; i < n-1; i++)
            {
                for(ii = 1; ii < n-1; ii++)
                {
                    //(ii,i)위치에서의 가격
                    n_place_value = place_price[ii-1][i]+place_price[ii][i]+place_price[ii+1][i]+place_price[ii][i-1]+place_price[ii][i+1];
                    
                    //꽃이 겹치면 n_place_value값이 음수를 나타냄 = 겹치지 않는 장소 찾기
                    if (n_place_value >= 0 && (saved_xx == -4 || n_place_value < saved_price[k]))
                    {
                        //일단 현재 i,ii값에 대해, 최대한 최적의 값을 찾은경우 일단 저장하고, 저장한 값을 기준으로 계속 마지막열까지 최적의 값을 찾음.
                        saved_price[k] = n_place_value;
                        
                        //최저가의 위치를 저장
                        saved_xx = ii;
                        saved_yy = i;
                    }
                }
            }
            
            //꽃이 차지하고 있는 구역은 화분 가격 도표에서 -801로 변경 = 만약 꽃이 서로 겹칠 경우, 코드상 현재 씨앗의 위치에 대한 필요한 가격이 무조건 음수가 됨 / 아닌경우 양수
            //이때, 가격이 -801로 변경되는 곳의 위치는 값이 가장 싼 구역의 위치 (= 저장된 최저가의 위치)
            saved_xx = (saved_xx == -4) ? 1 : saved_xx;
            saved_yy = (saved_yy == -4) ? 1 : saved_yy;
            place_price[saved_xx-1][saved_yy] = -801;
            place_price[saved_xx+1][saved_yy] = -801;
            place_price[saved_xx][saved_yy] = -801;
            place_price[saved_xx][saved_yy-1] = -801;
            place_price[saved_xx][saved_yy+1] = -801;
        }
        

        //정답 출력
        int ans = 0;
        for(i = 0; i < 3; i++)
        {
            ans += saved_price[i];
        }
        bw.write(ans+"\n");
        bw.flush();
    }
}
