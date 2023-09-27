import java.io.*;
import java.util.*;

public class question_1966 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));        
        
        //arraylist 생성
        ArrayList<Integer> arr = new ArrayList<>();
        
        
        
        //테스트 케이스
        int test_case = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < test_case; i++)
        {
            int ans = 0;
            String str[] = br.readLine().split(" ");
            int doc_num = Integer.parseInt(str[0]);
            int n_doc_pos = Integer.parseInt(str[1]);
            
            int highest_imp_ind = 0;
            
            //문서 인풋값
            String str_doc_input[] = br.readLine().split(" ");
            for(int ii = 0; ii < doc_num; ii++)
            {
                arr.add(Integer.parseInt(str_doc_input[ii]));
            }
            

            //전체 문서중에 더 중요도가 높은게 있는지 확인
            for(int ii = 1; ii < arr.size(); ii++)
            {
                if (arr.get(0) < arr.get(ii))
                {
                    highest_imp_ind = ii;
                }
            }
            
            if (highest_imp_ind == 0)
            {
                arr.get(highest_imp_ind);
                arr.remove(highest_imp_ind);
            }
            else
            {
                ans++;
            }
            
            arr.get(highest_imp_ind);
            arr.remove(highest_imp_ind);
        }

        
        //답
        bw.flush();
    }
}
