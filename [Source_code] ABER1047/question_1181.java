import java.util.*;
import java.io.*;

public class question_1181
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Set<String> set = new HashSet<>();
        
        int rows = Integer.parseInt(br.readLine());
        for(int i = 0; i < rows; i++)
        {
            set.add(br.readLine());
        }
        
        List<String> arr_list = new ArrayList<>(set);
        Collections.sort(arr_list, new Comparator<String>()
        {
            @Override
            public int compare(String a, String b) 
            {
                if (a.length() == b.length()) 
                {
                    return a.compareTo(b); // 사전 순으로 정렬
                } 
                else 
                {
                    return Integer.compare(a.length(), b.length()); // 길이순 정렬
                }
            }
        });
        

        for(int i = 0; i < arr_list.size(); i++)
        {
            bw.write(arr_list.get(i)+"\n");
        }
        bw.flush();
    }
}