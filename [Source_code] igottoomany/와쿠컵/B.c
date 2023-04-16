#include <stdio.h>

int main()
{
    int A, B, c = 0;
    int a[11] = {0}, b[11] = {0};

    scanf("%d %d", &A, &B);
    for (int i = 512; i >= 1; i /= 2)
    {
        if (!(A >= i && B >= i) && (A >= i || B >= i))
        {
            c += i;
        }
        if (A >= i)
            A -= i;
        if (B >= i)
            B -= i;
        
    }
    printf("%d\n", c);
}