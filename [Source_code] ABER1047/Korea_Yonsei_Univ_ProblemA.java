import java.util.*;


//2023 고려대학교x연세대학교 프로그래밍 경시대회 Open Contest
//https://www.acmicpc.net/contest/problem/981/1
public class Korea_Yonsei_Univ_ProblemA
{
    public static void main(String[] args)
    {
        char korea_str[] = {'K','O','R','E','A'};
        char yonsei_str[] = {'Y','O','N','S','E','I'};
        int n_founded_korea = 0;
        int n_founded_yonsei = 0;
        
        
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        
        for(int i = 0; i < S.length(); i++)
        {
            if (n_founded_yonsei == 6)
            {
                System.out.print("YONSEI");
                break;
            }
            else if (n_founded_korea == 5)
            {
                System.out.print("KOREA");
                break;
            }
        
            char n_str = S.charAt(i);
            //System.out.println(n_str+" "+yonsei_str[n_founded_yonsei]+" / "+n_str+" "+korea_str[n_founded_korea]);
            n_founded_yonsei += (n_str == yonsei_str[n_founded_yonsei]) ? 1 : 0;
            n_founded_korea += (n_str == korea_str[n_founded_korea]) ? 1 : 0;
        }
    }
}