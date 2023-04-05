import java.io.*;
import java.util.*;

public class question_2751
{
    public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> num_array = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i++) 
        {
			num_array.add(Integer.parseInt(br.readLine()));
		}
		
        
        //정렬
		Collections.sort(num_array);
        
		for(int i = 0; i < N; i++) 
        {
			bw.write(num_array.get(i)+"\n");
		}
		
		bw.flush();
	}
}
