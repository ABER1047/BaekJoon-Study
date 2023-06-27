import java.io.*;

public class question_2167 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input[] = br.readLine().split(" ");
        int width = Integer.parseInt(input[1]);
        int height = Integer.parseInt(input[0]);
        int arr1[][] = new int[height][width];
        
        for(int i = 0; i < height; i++)
        {
            String input2[] = br.readLine().split(" ");
            for(int ii = 0; ii < width; ii++)
            {
                arr1[i][ii] = Integer.parseInt(input2[ii]);
            }
        }
        
        
        int height2 = Integer.parseInt(br.readLine());
        int pos_arr[][] = new int[height2][4];
        for(int i = 0; i < height2; i++)
        {
            int sum = 0;
            String input3[] = br.readLine().split(" ");
            for(int ii = 0; ii < 4; ii++)
            {
                pos_arr[i][ii] = Integer.parseInt(input3[ii]);
            }
            
            //pos_arr(y x y x)
            for(int j = pos_arr[i][0]-1; j < pos_arr[i][2]; j++) //height
            {
                for(int jj = pos_arr[i][1]-1; jj < pos_arr[i][3]; jj++) //width
                {
                    sum += arr1[j][jj];
                }
            }
            bw.write(sum+"\n");
        }
        


        
        bw.flush();
    }
}


