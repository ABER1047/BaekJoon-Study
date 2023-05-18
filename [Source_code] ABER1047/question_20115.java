import java.util.*;
import java.io.*;


public class question_20115 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        ArrayList<Integer> drink = new ArrayList<Integer>();
        int n = Integer.parseInt(br.readLine());
        
        String str[] = br.readLine().split(" ");
        for(int i = 0; i < n; i++)
        {
            drink.add(Integer.parseInt(str[i]));
        }
        
        Collections.sort(drink, Collections.reverseOrder());
        
        double ans = drink.get(0);
        for(int i = 1; i < n; i++)
        {
            ans += drink.get(i)*0.5;
        }
        
        bw.write(ans+"\n");
        bw.flush();
        bw.close();
    }
}
