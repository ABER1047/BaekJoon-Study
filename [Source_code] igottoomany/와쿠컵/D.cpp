#include <iostream>

using namespace std;
int n, diff = 1;
string s;
int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0), cout.tie(0);

    cin >> n >> s;
    for (int i = 0; i < n; i++)
    {
        diff = 1;
        for (int j = 0; j + i < n; j++)
        {
            if (s[j] != s[j + i])
                diff--;
            if (diff < 0)
                break;
        }
        if (diff == 0)
        {
            cout << "YES\n";
            return (0);
        }
    }
    cout << "NO";
}