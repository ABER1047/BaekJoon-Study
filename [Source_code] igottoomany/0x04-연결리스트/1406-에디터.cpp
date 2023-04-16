#include <iostream>
#include <list>

using namespace std;
list<char> str;
list<char>::iterator iter;
int n;
char c;
int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0), cout.tie(0);

    while ((c = cin.get()) != '\n')
        str.push_back(c);
    iter = str.end();
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        cin >> c;
        switch (c)
        {
        case 'P':
            cin >> c;
            str.insert(iter, c);
            break;
        case 'L':
            if (iter != str.begin())
                iter--;
            break;
        case 'D':
            if (iter != str.end())
                iter++;
            break;
        case 'B':
            if (iter != str.begin())
                iter = str.erase(--iter);
            break;
        }
    }
    for (iter = str.begin(); iter != str.end(); iter++)
        cout << *iter;
    cout << '\n';
}
