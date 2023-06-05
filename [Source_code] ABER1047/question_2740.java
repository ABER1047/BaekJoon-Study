import java.util.*;

public class question_2740 
{
    //C(i, j) = A(i,1)*B(1,j) + A(i,2)*B(2,j) + ... + A(i,n)*B(n,j)
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int array_1[][] = new int[N][M];
        for(int ii = 0; ii < N; ii++)
        {
            for(int i = 0; i < M; i++)
            {
                array_1[ii][i] = sc.nextInt();
            }
        }
        
        
        int M2 = sc.nextInt();
        int K = sc.nextInt();
        
        int array_2[][] = new int[M2][K];
        for(int ii = 0; ii < M2; ii++)
        {
            for(int i = 0; i < K; i++)
            {
                array_2[ii][i] = sc.nextInt();
            }
        }
        
        
        for(int i = 0; i < N; i++)
        {
            for(int ii = 0; ii < K; ii++)
            {
                int sum = 0;
                for(int iii = 0; iii < M; iii++)
                {
                    sum += array_1[i][iii]*array_2[iii][ii];
                }
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
