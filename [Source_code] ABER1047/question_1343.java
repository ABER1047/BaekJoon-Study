import java.util.*;
import java.io.*;

public class question_1343
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int placeable = 1;
        
        //맵 불러오기
        char map[] = br.readLine().toCharArray();


        int is_placeable = 0, i_plusment = 0;
        for(int i = 0; i < map.length; i += i_plusment)
        {
            //배치할 수 있는 칸 수 체크
            is_placeable = 0;
            for(int ii = 0; ii < 4; ii++)
            {
                //배열 범위 벗어났는지 체크
                if (i+ii >= map.length)
                {
                    break;
                }
                else if (map[i+ii] == 'X')
                {
                    is_placeable ++;
                }
                else
                {
                    i_plusment = 1;
                    break;
                }
            }
            
            //AAAA 혹은 BB가 배치 가능한 경우 배치하기
            if (is_placeable == 2 || is_placeable == 4)
            {
                char char_type = (is_placeable == 2) ? 'B' : 'A';
                for(int ii = 0; ii < is_placeable; ii++)
                {
                    map[i+ii] = char_type;
                }
            }
            else
            {
                if (is_placeable != 0)
                {
                    placeable = 0;
                    break;
                }
            }
            
            i_plusment = (i_plusment != 1) ? is_placeable : i_plusment;
        }
        
        
        if (placeable == 1)
        {
            for(int i = 0; i < map.length; i++)
            {
                bw.write(map[i]);
            }
            bw.write("\n");
        }
        else
        {
            bw.write("-1");
        }
        bw.flush();
        bw.close();
    }
}