//바킹독 0x03 배열
#include <stdio.h>

int main()
{
    int alpha[26] = {0};
    char str[101];
    scanf("%s", str);
    for (int i = 0; i[str]; i++)
        alpha[(int)str[i] - 'a']++;
    for (int i = 0; i < 26; i++)
        printf("%d ", alpha[i]);
}