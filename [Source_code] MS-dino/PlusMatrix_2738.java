import java.util.Scanner;

public class PlusMatrix_2738 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N, M;
		int[][] A;
		int[][] B;
		int[][] PlusMatrix;
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		A = new int[N][M];
		B = new int[N][M];
		PlusMatrix = new int[N][M];
		
		for(int i = 0; i < N ; i++) {
			for(int j = 0 ; j < M ; j++) {
				A[i][j] = sc.nextInt();
				
			}
			
		}
		for(int i = 0; i < N ; i++) {
			for(int j = 0 ; j < M ; j++) {
				B[i][j] = sc.nextInt();
				
			}
			
		}
		for(int i = 0; i < N ; i++) {
			for(int j = 0 ; j < M ; j++) {
				PlusMatrix[i][j] = A[i][j] + B[i][j];
				System.out.print(PlusMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
