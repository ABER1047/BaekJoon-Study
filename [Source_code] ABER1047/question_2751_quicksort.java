import java.io.*;

public class question_2751_quicksort
{
    public static void main(String[] args) throws NumberFormatException, IOException 
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int num_array[] = new int[N];
        
        for(int i = 0; i < N; i++)
        {
        num_array[i] = Integer.parseInt(br.readLine());
        }
        
        //퀵 정렬
        quick_sort(num_array,0,N-1);
        
        String ans = "";
        for(int i = 0; i < N; i++)
        {
            ans += num_array[i]+"\n";
        }
        
        bw.write(ans);
        bw.flush();
    }
    
    
    //퀵 정렬 함수 선언
    static void quick_sort(int num_array[], int left, int right) 
    {
        int target_num = num_array[(left+right)/2];
        int l = left;
        int r = right;
    
        do
        {
            while(num_array[l] < target_num)
            {
                l++;
            }
            
            while(num_array[r] > target_num)
            {
                r--;
            }
            
            if (l <= r)
            {
                int temp = num_array[l];
                num_array[l] = num_array[r];
                num_array[r] = temp;
                
                l++;
                r--;
            }
        } while(l <= r);
        
        
        if (left < r)
        {
            quick_sort(num_array,left,r);
        }
        
        if (right > l)
        {
            quick_sort(num_array,l,right);
        }
    }
}
