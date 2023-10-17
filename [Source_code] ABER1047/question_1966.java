import java.io.*;
import java.util.*;

public class question_1966 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));        
        

        //테스트 케이스
        int test_case = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < test_case; i++)
        {
            //arraylist 생성
            ArrayList<Integer> arr = new ArrayList<>();
            ArrayList<Integer> arr_highest = new ArrayList<>();
            
            int ans = 0;
            String str[] = br.readLine().split(" ");
            int doc_num = Integer.parseInt(str[0]);
            int n_doc_pos = Integer.parseInt(str[1]);
            
            //문서 인풋값
            String str_doc_input[] = br.readLine().split(" ");
            for(int ii = 0; ii < doc_num; ii++)
            {
                int tmp_val = Integer.parseInt(str_doc_input[ii]);
                arr.add(tmp_val);
                arr_highest.add(tmp_val);
            }
            
            //중요도 높은 순서대로 정렬
            Collections.sort(arr_highest,Collections.reverseOrder());
            
            //전체 문서중에 더 중요도가 높은게 있는지 확인
            int highest_num = arr_highest.remove(0);
            while(true)
            {
                int n_num = arr.remove(0);
                
                //우선도 체크
                if (n_num >= highest_num)
                {
                    ans ++;
                    if (highest_num == n_num)
                    {
                        // bw.write((arr)+"\t\t"+(n_doc_pos)+" / "+(highest_num)+"\n");
                        if (arr_highest.isEmpty())
                        {
                            break;
                        }
                        highest_num = arr_highest.remove(0);
                        
                        if (n_doc_pos <= 0)
                        {
                            break;
                        }
                    }
                }
                else //숫자 뒤로 넘기기
                {
                    arr.add(n_num);
                }
                n_doc_pos --;
                
                if (n_doc_pos < 0)
                {
                    n_doc_pos = arr.size()-1;
                }
                // bw.write((arr)+"\t"+(n_doc_pos)+" / "+(highest_num)+"\n");
            }

            bw.write(ans+"\n");
        }

        
        //답
        bw.flush();
    }
}
