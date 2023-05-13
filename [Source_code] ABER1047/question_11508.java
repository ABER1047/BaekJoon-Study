import java.util.*;
import java.io.*;

public class question_11508
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        ArrayList<Integer> prices = new ArrayList<Integer>();
        
        int n = Integer.parseInt(br.readLine());
        int total_price = 0;
        
        
        for(int i = 0; i < n; i++)
        {
            prices.add(Integer.parseInt(br.readLine()));
        }
        
        Collections.sort(prices, Collections.reverseOrder());
        
        for(int i = 0; i < prices.size(); i++)
        {
            if (i+3 <= prices.size())
            {
                total_price += prices.get(i)+prices.get(i+1);
                i += 2;
            }
            else
            {
                total_price += prices.get(i);
            }
        }
        
        bw.write(total_price+"\n");
        bw.flush();
    }
}
