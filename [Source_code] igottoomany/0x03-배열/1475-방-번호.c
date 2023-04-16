//바킹독 0x03 배열 연습문제

#include <stdio.h>
#include <math.h>

int main()
{
    int n, num[10] = {0}, max = 0;

    scanf("%d", &n);
    while (n > 0)
    {
        num[n % 10]++;
        n /= 10;
    }
    num[6] = (num[6] + num[9]) / 2 + (num[6] + num[9]) % 2;
    for (int i = 1; i < 9; i++)
    {
        if(num[max] < num[i])
            max = i;
    }
    printf("%d\n", num[max]);
}