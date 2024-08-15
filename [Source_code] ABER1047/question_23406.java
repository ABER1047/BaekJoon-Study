import java.util.*;
import java.io.*;

public class question_23406 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        int divisionable_num = 0;
        double average = 0;
        for(int i = 0; i < 20; i++)
        {
            String str[] = br.readLine().split(" ");
            double tmp_db = Double.parseDouble(str[1]);
            switch(str[2])
            {
                case "A+":
                    divisionable_num += tmp_db;
                    average += 4.5*tmp_db;
                break;
                
                case "A0":
                    divisionable_num += tmp_db;
                    average += 4*tmp_db;
                break;
                
                case "B+":
                    divisionable_num += tmp_db;
                    average += 3.5*tmp_db;
                break;
                
                case "B0":
                    divisionable_num += tmp_db;
                    average += 3*tmp_db;
                break;
                
                case "C+":
                    divisionable_num += tmp_db;
                    average += 2.5*tmp_db;
                break;
                
                case "C0":
                    divisionable_num += tmp_db;
                    average += 2*tmp_db;
                break;
                
                case "D+":
                    divisionable_num += tmp_db;
                    average += 1.5*tmp_db;
                break;
                
                case "D0":
                    divisionable_num += tmp_db;
                    average += tmp_db;
                break;
                
                case "F":
                    divisionable_num += tmp_db;
                break;
            }
        }
        
        bw.write((average/divisionable_num)+"\n");
        bw.flush();
    }
}
