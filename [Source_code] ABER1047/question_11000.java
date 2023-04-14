import java.io.*;
import java.util.*;

public class question_11000 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        class_info[] ins_class = new class_info[N];
        
        
        //get input values
        for(int i = 0; i < N; i++)
        {
            String[] input = br.readLine().split(" ");
            
            int start_time = Integer.parseInt(input[0]);
            int end_time = Integer.parseInt(input[1]);
            
            ins_class[i] = new class_info(start_time,end_time);
        }
        
        //arrange
        Arrays.sort(ins_class);
        
        //큐 생성
        ArrayList<class_info> class_array = new ArrayList<class_info>();
        
        int ii = 1, answer = 0;
        for (int i = 0; i < N; i++) 
        {
            class_array.add(ins_class);
        }
        
        
        //정답 출력
        bw.write(answer+"\n");
        bw.flush();
    }    
    
    
    static class class_info implements Comparable<class_info>
    {
        int start_time, end_time;
        
        public class_info(int start_time, int end_time)
        {
            this.start_time = start_time;
            this.end_time = end_time;
        }
        
        @Override
        public int compareTo(class_info other)
        {
            return this.start_time - other.start_time;
        }
    } 
}
