import java.util.*;

public class question_2667
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    
        int area = 0, max_x = 0, max_y = 0;
        
        int x1[] = new int[4];
        int y1[] = new int[4];
        int x2[] = new int[4];
        int y2[] = new int[4];
        
        
        //입력 가져오기
        for(int i = 0; i < 4; i++)
        {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();
            
            
            //좌표평면의 최대 크기 설정
            max_x = (max_x < x2[i]) ? x2[i] : max_x;
            max_y = (max_y < y2[i]) ? y2[i] : max_y;
        }
        
        
        //좌표평면 맵 생성
        int map_array[][] = new int[max_x][max_y];
        
        for(int i = 0; i < 4; i++)
        {
            for(int k = x1[i]; k < x2[i]; k++)
            {
                for(int kk = y1[i]; kk < y2[i]; kk++)
                {
                    map_array[k][kk] = 1;
                }
            }
        }
        
        
        //생성된 맵 기준으로 넓이 체크
        for(int k = 0; k < max_x; k++)
        {
            for(int kk = 0; kk < max_y; kk++)
            {
                area += (map_array[k][kk] == 1) ? 1 : 0;
            }
        }
    
        //정답
        System.out.print(area);
    }
}
