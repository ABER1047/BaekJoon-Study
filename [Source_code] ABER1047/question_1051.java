import java.util.*;
import java.io.*;

public class question_1051
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" ");
        int height = Integer.parseInt(str[0]), width = Integer.parseInt(str[1]);
        
        char map[][] = new char[height][width];
        for (int i = 0; i < height; i++) 
        {
            map[i] = br.readLine().toCharArray();
        }
        
        int maxLen = 1;  // 최소 정사각형 크기 (한 변의 길이)
        for (int i = 0; i < height; i++) 
        {
            for (int j = 0; j < width; j++) 
            {
                char current = map[i][j];
                for (int size = maxLen; i + size < height && j + size < width; size++) 
                {
                    if (map[i + size][j] == current && map[i][j + size] == current && map[i + size][j + size] == current) 
                    {
                        maxLen = size + 1;
                    }
                }
            }
        }
        

        bw.write((maxLen * maxLen)+"\n");
        bw.flush();
    }
}
