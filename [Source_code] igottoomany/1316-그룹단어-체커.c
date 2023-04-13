#include <iostream>
#include <string>
#include <cstring>
#define STRING_SIZE 100


using namespace std;


int main(){
    int n, cnt;
    int alphabet[26];
    
    scanf("%d", &n);
    cnt = n;
    for(n=n; n > 0; n--){
        char s[STRING_SIZE];
        scanf("%s", s);
        int len = strlen(s);
        for(int i=0; i < 26; i++){
            alphabet[i] = 0;
        }
        for(int i=0; i < len; i++){
            if(alphabet[s[i] - 97] == 0){
                alphabet[s[i] - 97] = 1;
                while(s[i] == s[i+1]){
                    i++;
                }
            }
            else{
                cnt--;
                break;
            }
        }
    }

    printf("%d\n", cnt);
}
