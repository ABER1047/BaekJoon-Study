#include <stdio.h>

int main()
{
    char n[101], alpha[26];
    scanf("%s", n);
    for (int i = 0; i < 26; i++)
        alpha[i] = -1;
    for (int i = 0; n[i]; i++)
    {
        if (alpha[n[i] - 'a'] == -1)
            alpha[n[i] - 'a'] = i;
    }
    for (int i = 0; i < 26; i++)
    {
        printf("%d ", alpha[i]);
    }
}