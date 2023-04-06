import java.util.*;
import java.io.*;

public class question_1202
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]); // N은 보석 갯수
        int K = Integer.parseInt(input[1]); // 가방 갯수

        // 보석 정보
        jewel_info[] jewel = new jewel_info[N];
        for (int i = 0; i < N; i++) 
        {
            input = br.readLine().split(" ");
            
            int weight = Integer.parseInt(input[0]);
            int value = Integer.parseInt(input[1]);
            
            jewel[i] = new jewel_info(weight, value);
        }

        // 가방 정보
        int[] bp = new int[K];
        for (int i = 0; i < K; i++) 
        {
            bp[i] = Integer.parseInt(br.readLine());
        }

        // 보석과 가방을 무게순으로 정렬
        Arrays.sort(jewel);
        Arrays.sort(bp);

        //큐 생성
        PriorityQueue<Integer> bp_jewel_info_queue = new PriorityQueue<>(Collections.reverseOrder());
        long answer = 0;
        int ii = 0;
        for (int i = 0; i < K; i++) 
        {
            // 현재 가방에 담을 수 있는 모든 보석을 우선순위 큐에 넣음
            for(; (ii < N && jewel[ii].weight <= bp[i]); ii++)
            {
                bp_jewel_info_queue.offer(jewel[ii].value);
            }

            // 현재 가방에 가장 비싼 보석을 담음
            if (!bp_jewel_info_queue.isEmpty()) 
            {
                answer += bp_jewel_info_queue.poll();
            }
        }

        bw.write(answer + "\n");
        bw.flush();
    }

    static class jewel_info implements Comparable<jewel_info> {
        int weight, value;

        public jewel_info(int weight, int value) 
        {
            this.weight = weight;
            this.value = value;
        }

        @Override
        public int compareTo(jewel_info other) 
        {
            return this.weight - other.weight;
        }
    }
}
