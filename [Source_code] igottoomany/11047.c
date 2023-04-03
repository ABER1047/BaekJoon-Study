//바킹독 0x11강 그리디 1번 문제
//https://www.acmicpc.net/problem/11047
/*
준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.

첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)
둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)
*/

#include <stdio.h>

int N;

int find_coin(int *a, int K, int cnt)
{
	int rst;
	
	if (K == 0)
		return (cnt);
	else if (K < 0)
		return (-1);
	for(int i = N - 1; i >= 0; i--)
	{
		if (a[i] <= K)
		{
			rst = find_coin(a, K % a[i], cnt + K / a[i]);
			if (rst >= 0)
				return (rst);
		}
	}
	return (rst);
}

int main()
{
    int K;
    scanf("%d %d", &N, &K);
    int a[N];
    for (int i = 0; i < N; i++)
        scanf("%d", &a[i]);
    printf("%d\n", find_coin(a, K, 0));
}