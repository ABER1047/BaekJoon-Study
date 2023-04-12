#include <stdio.h>

int main()
{
    int a, b;
    scanf("%d %d", &a, &b);

    a = a % 10 * 100 + a % 100 / 10 * 10 + a / 100;
    b = b % 10 * 100 + b % 100 / 10 * 10 + b / 100;
    if (a > b) return (printf("%d\n", a) * 0);
    printf("%d\n", b);
}