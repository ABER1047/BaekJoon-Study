import java.io.*;

public class question_11660 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str1 = br.readLine().split(" ");
        int n = Integer.parseInt(str1[0]);
        int m = Integer.parseInt(str1[1]);
        
        
        int arr[][] = new int[n][n];
        int dp[][] = new int[n][n];
        int pos[][] = new int[m][4];
        for(int i = 0; i < n+m; i++)//height
        {
            String temp_str[] = br.readLine().split(" ");
            for(int ii = 0; ii < n; ii++)//width
            {
                arr[i][ii] = Integer.parseInt(temp_str[ii]);
                dp[i][ii] =
            }
        }
        
        for(int i = 0; i < m; i++)//height
        {
            String temp_str2[] = br.readLine().split(" ");
            for(int ii = 0; ii < 4; ii++)//width
            {
                pos[i-n][ii] = Integer.parseInt(temp_str2[ii]);
            }
        }
        

        bw.write(sum+"\n");
        bw.flush();
    }
}
