#include <stdio.h>
#include <math.h>

int main()
{
    int T = 99 * 99, h = 99, w = 99, n;
    scanf("%d", &T);
    while (T-- > 0)
    {
        scanf("%d %d %d", &h, &w, &n);
        printf("%d\n", ((n - 1) % h + 1) * 100 + (n - 1) / h + 1);
    }
}