#include <stdio.h>

int a[42] = {0};

int main()
{
    int cnt = 0;
    for (int i = 0; i < 10; i++)
    {
        int b;
        scanf("%d", &b);
        if (!a[b % 42])
            cnt++;
        a[b % 42]++;
    }
    printf("%d\n", cnt);
}