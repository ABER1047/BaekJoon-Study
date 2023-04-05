//2023 고려대학교x연세대학교 프로그래밍 경시대회 Open Contest A
//27930 당신은 운명을 믿나요?

#include <stdio.h>

int main()
{
    char *kor = "KOREA";
    char *yon = "YONSEI";
    char S[5000001];

    scanf("%s", S);
    for(int i = 0; S[i]; i++)
    {
        kor += (S[i] == *kor);
        yon += (S[i] == *yon);
        if (!*kor)
            return (printf("KOREA\n") * 0);
        if (!*yon)
            return (printf("YONSEI\n") * 0);
    }
}