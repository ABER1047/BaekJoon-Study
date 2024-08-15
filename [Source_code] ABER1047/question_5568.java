import java.util.*;
import java.io.*;

public class question_5568
{
    public static int card_value[];
    public static Set<String> already_used = new HashSet<>();
    public static int[] combination; // 조합을 저장할 배열
    public static void main(String[] args) throws IOException
    {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int card_num = Integer.parseInt(br.readLine()); //카드 갯수
        int choose_num = Integer.parseInt(br.readLine()); //선택할 카드 갯수
        
        card_value = new int[card_num];
        for(int i = 0; i < card_num; i++)
        {
            card_value[i] = Integer.parseInt(br.readLine());
        }
        
        combination = new int[choose_num];
        generateCombinations(card_num, choose_num, 0, 0);
        
        //bw.write("= "+already_used+"\n");
        bw.write(already_used.size()+"\n");
        bw.flush();
    }
    
    
    static void generateCombinations(int max_num, int choose_num, int start_num, int depth) 
    {
        // depth = 몇번째 카드까지 선택되었는지 체크용
        if (depth == choose_num) //모든 카드 선택됨
        {
            generatePermutations(combination, 0, choose_num);
        }
        else
        {
            for(int i = start_num; i < max_num; i++) 
            {
                combination[depth] = card_value[i];
                generateCombinations(max_num, choose_num, i + 1, depth + 1);
            }
        }
    }
    
    // 순열을 생성합니다.
    static void generatePermutations(int[] arr, int start, int length) 
    {
        if (start == length) 
        {
            StringBuilder numberBuilder = new StringBuilder();
            for (int num : arr) 
            {
                numberBuilder.append(num);
            }
            already_used.add(numberBuilder.toString());
        }
        else
        {
            for(int i = start; i < length; i++) 
            {
                swap(arr, start, i);
                generatePermutations(arr, start + 1, length);
                swap(arr, start, i); // backtrack
            }
        }
    }

    // 배열 요소를 교환하는 유틸리티 메서드
    static void swap(int[] arr, int i, int j) 
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
