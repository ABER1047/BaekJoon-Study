//GEC-Cup A
//27889 특별한 학교 이름

#include <stdio.h>

int main()
{
    char *N = "North London Collegiate School\n";
    char *B = "Branksome Hall Asia\n";
    char *K = "Korea International School\n";
    char *S = "St. Johnsbury Academy\n";
    char I[5], *r = 0;
    scanf("%s", I);
    switch (I[0])
    {
    case 'N':
        r = N;
        break;
    case 'B':
        r = B;
        break;
    case 'K':
        r = K;
        break;
    case 'S':
        r = S;
        break;
    }
    printf("%s", r);
}