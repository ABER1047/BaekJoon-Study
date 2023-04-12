#include <stdio.h>

int n, m, min;

void find(int x, int y, int cnt, char arr[n][m + 1])
{
    if (x == n - 1 && y == m - 1)
    {
        if (cnt < min)
            min = cnt;
    }
    if (x + 1 < n && arr[x + 1][y] == '1')
    {
        arr[x + 1][y] = '0';
        find(x + 1, y, cnt + 1, arr);
        arr[x + 1][y] = '1';
    }
    if (y + 1 < m && arr[x][y + 1] == '1')
    {
        arr[x][y + 1] = '0';
        find(x, y + 1, cnt + 1, arr);
        arr[x][y + 1] = '1';
    }
    if (x - 1 >= 0 && arr[x - 1][y] == '1')
    {
        arr[x - 1][y] = '0';
        find(x - 1, y, cnt + 1, arr);
        arr[x - 1][y] = '1';
    }
    if (y - 1 >= 0 && arr[x][y - 1] == '1')
    {
        arr[x][y - 1] = '0';
        find(x , y - 1, cnt + 1, arr);
        arr[x][y - 1] = '1';
    }
}

int main()
{
    scanf("%d %d", &n, &m);
    char arr[n][m + 1];
    min = n * m + 1;
    for (int i = 0; i < n; i++)
        scanf("%s", arr[i]);
    find(0, 0, 1, arr);
    printf("%d\n", min);
}