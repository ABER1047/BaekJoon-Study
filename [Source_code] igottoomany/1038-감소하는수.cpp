#include <stdio.h>

long long int cnt = 0, input;

long long int dfs(long long int d, long long int n, long long int s)
{
	if (d <= 0)
	{
		if (cnt == input)
			return s;
		cnt++;
		return -2;
	}
	for (long long int i = d - 1; i < n; i++)
	{
		long long int r = dfs(d - 1, i, s * 10 + i);
		if(r >= 0)
			return r;
	}
	return -2;
}

int main()
{
	scanf("%lld", &input);
	if (input >= 1023)
	{
		printf("-1\n");
		return 0;
	}
	for (long long int i = 1; i <= 10; i++)
	{
		long long int r = dfs(i, 10, 0);
		if (r >= 0)
		{
			printf("%lld\n", r);
			return 0;
		}
	}
}