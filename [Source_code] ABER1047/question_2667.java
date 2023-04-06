import java.util.*;
import java.io.*;

public class question_2667
{
    public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        int size = Integer.parseInt(br.readLine());
        int map_array[][] = new int[size][size];
        
        int assign_address = 1, total_house_num = 0;
        int check_pathxx[] = {0,1,0,-1};
        int check_pathyy[] = {-1,0,1,0};
        ArrayList<Integer> ans_house_num = new ArrayList<Integer>();
        
        int crossed_way_num = 0;
        

        int i = 0, ii = 0;
		for(i = 0; i < size; i++) 
        {
            String[] str = br.readLine().split("");
            for(ii = 0; ii < size; ii++) 
            {
			    map_array[ii][i] = Integer.valueOf(str[ii]);
		    }
        }
        
        //for문으로 쭉 집이 있는지 체크하고
        //집 발견한 경우, 해당 집 좌표를 기준으로, 상 우 하 좌 순으로 옆에 집이 있는지 체크 하고 있으면 거기 좌표로 이동 (이동한 길은 단지수 부여)
        //상 우 하 좌 모두 옆에 집이 없는 경우, 이전 좌표로 되돌아가고, 돌아갈 이전 좌표 자체가 존재하지 않는 경우 반복문 탈출
        //이론상 for문(맵 탐색)이 모두 끝나면 프로그램 종료
        for(i = 0; i < size; i++) 
        {
            for(ii = 0; ii < size; ii++) 
            {
                //집 있는지 체크
			    if (map_array[ii][i] == 1)
                {
                    int n_xx = ii;
                    int n_yy = i;
                    ArrayList<Integer> b_xx = new ArrayList<Integer>();
                    ArrayList<Integer> b_yy = new ArrayList<Integer>();
                
                    crossed_way_num = 0;
                    total_house_num = 1;
                    assign_address ++;
                    
                    while(true)
                    {
                        //집 발견시, 해당 좌표 기준으로 상 우 하 좌 순으로 옆에 집이 있는지 체크 (만약 옆에 집을 체크하는데 해당 범위가 어레이 밖일 경우는 측정하지 않음)
                        int k = 0;
                        for(k = 0; k < 4; k++)
                        {
                            int horizontal_coord = n_xx+check_pathxx[k];
                            int vertical_coord = n_yy+check_pathyy[k];
                        
                            if (horizontal_coord >= 0 && horizontal_coord < size && vertical_coord >= 0 && vertical_coord < size && map_array[horizontal_coord][vertical_coord] == 1)
                            {
                                //이전 좌표 기록
                                b_xx.add(n_xx);
                                b_yy.add(n_yy);
                                crossed_way_num ++;
                                total_house_num ++;
                            
                                //상 우 하 좌 순으로 옆에 집이 있으면 거기 좌표로 이동
                                n_xx = horizontal_coord;
                                n_yy = vertical_coord;
                                
                                //(이동한 길은 단지수 부여)
                                map_array[horizontal_coord][vertical_coord] = assign_address;
                                break;
                            }
                        }
                        
                        
                        //상 우 하 좌 모두 옆에 집이 없는 경우, 이전 좌표로 되돌아가고, 돌아갈 이전 좌표 자체가 존재하지 않는 경우 반복문 탈출
                        if (k == 4)
                        {
                            crossed_way_num --;
                            if (crossed_way_num >= 0)
                            {
                                n_xx = b_xx.get(crossed_way_num);
                                n_yy = b_yy.get(crossed_way_num);
                            }
                            else
                            {
                                break;
                            }
                        }
                    }
                    
                    ans_house_num.add(total_house_num);
                }
		    }
        }
        
        
        //정답 출력
        int total_village = assign_address-1;
        bw.write(total_village+"\n");
        //정렬
		Collections.sort(ans_house_num);
        for(i = 0; i < total_village; i++)
        {
            bw.write(ans_house_num.get(i)+"\n");
        }
        bw.flush();
    }
}
