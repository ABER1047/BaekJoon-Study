import java.util.*;
import java.io.*;
import java.lang.*;

public class question_1744
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        int n = Integer.parseInt(br.readLine());
        
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            numbers.add(Integer.parseInt(br.readLine()));
        }
        
        
        Collections.sort(numbers);


        int i = 0, j = n-1, ans = 0;
        
        
        while(i+1 < n && numbers.get(i) < 0 && numbers.get(i+1) < 0)
        {
            ans += numbers.get(i)*numbers.get(i+1);
            i += 2;
        }
        
        while(j > 0 && numbers.get(j) > 1 && numbers.get(j-1) > 1)
        {
            ans += numbers.get(j)*numbers.get(j-1);
            j -= 2;
        }
        
        while(i <= j)
        {
            if (i+1 < n && numbers.get(i+1) == 0)
            {
                i++;
            }
            else
            {
                ans += numbers.get(i);
                i++;
            }
        }
        bw.write(ans+"\n");
        bw.flush();
        bw.close();
	}
}
