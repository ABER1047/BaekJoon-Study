import java.util.*;
import java.io.*;

public class question_1159 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        int cnt[] = new int[(int)'z' - (int)'a'+1];
        Set<Character> resultSet = new HashSet<>();
        for(int i = 0; i < num; i++)
        {
            char tmp_char = br.readLine().charAt(0);
            int tmp_ind = (int)tmp_char - (int)'a';
            cnt[tmp_ind] ++;
            
            if (cnt[tmp_ind] >= 5)
            {
                resultSet.add(tmp_char);
            }
        }
        

        if (resultSet.isEmpty())
        {
            bw.write("PREDAJA");
        }
        else
        {
            List<Character> resultList = new ArrayList<>(resultSet);
            Collections.sort(resultList);  // 사전 순으로 정렬
            for(int i = 0; i < resultList.size(); i++) 
            {
                bw.write(resultList.get(i));
            }
        }
        
        bw.write("\n");
        bw.flush();
    }
}
