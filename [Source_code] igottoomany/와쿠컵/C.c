#include <stdio.h>

int main()
{
    long long n, i = 0, c = 0;
    scanf("%lld", &n);

    if (n >= 2)
    {
        i = 2;
        c = 2;
        while (c * 2 <= n)
        {
            c *= 2;
            i++;
        }
    }
    if (n > c)
        i++;
    printf("%lld\n", i);
}