#include <stdio.h>

int suffix[1000001];
int arr[1000001];
int n, s, a, min, cnt = 0;

int main()
{
    scanf("%d %d", &n, &s);
    min = n;
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
        suffix[i + 1] = suffix[i] + arr[i];
        printf("%d ", suffix[i + 1]);
    }
    printf("\n");
    if (suffix[n] < s)
    {
        printf("0\n");
        return (0);
    }
    int i = 1, j = 1;
    while (i <= n && j <= n)
    {
        printf("i: %d j: %d p: %d\n", i, j, suffix[j] - suffix[i - 1]);
        if (suffix[j] - suffix[i - 1] >= s)
        {
            if (j == i)
                return (printf("1\n") * 0);
            else if (min > j - i + 1)
                min = j - i + 1;
            i++;
        }
        else if (suffix[j] - suffix[i - 1] < s)
            j++;
    }
    printf("rst: %d\n", min);
}