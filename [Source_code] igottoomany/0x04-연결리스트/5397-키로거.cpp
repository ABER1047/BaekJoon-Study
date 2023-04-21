#include <iostream>
#include <list>

using namespace std;
int n;
char c;
string s;
int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0), cout.tie(0);

    cin >> n;
    for (int i = 0; i < n; i++)
    {
        list<char> str;
        list<char>::iterator iter;

        iter = str.end();
        cin >> s;
        for (int i = 0; i < s.length(); i++)
        {
            switch (s[i])
            {
            case '<':
                if (iter != str.begin())
                    iter--;
                break;
            case '>':
                if (iter != str.end())
                    iter++;
                break;
            case '-':
                if (iter != str.begin())
                    iter = str.erase(--iter);
                break;
            default:
                str.insert(iter, s[i]);
                break;
            }
        }
        for (iter = str.begin(); iter != str.end(); iter++)
            cout << *iter;
        cout << '\n';
    }
}
