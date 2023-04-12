//9793 Length and Frequency of Sentences

#include <stdio.h>
#include <string.h>

char s[1000000000];
int a[76] = {0, };

int main()
{
    int n;
    int max = 0;

    scanf("%d", &n);
    while (n > 0)
    {
        fflush(stdin);
        scanf("%[^\n]s", s);
        int cnt = 0;
        for (int i = 0; s[i]; i++)
        {
            if (s[i] != ' ')
            {
                cnt++;
                while  (s[i + 1] != ' ' &&  s[i + 1] != '\0')
                    i++;
                continue;
            }
        }
        if (cnt > max)
            max = cnt;
        a[cnt]++;
        n--;
    }
    for (int i = 0; i <= max; i++)
    {
        if (a[i] > 0)
            printf("%d %d\n", i, a[i]);
    }
}