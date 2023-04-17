#include <iostream>
#include <stack>
#define endl "\n"

using namespace std;
int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0), cout.tie(0);
    stack<int> s;
    int n, a;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        string str;
        cin >> str;
        if (str == "push")
        {
            cin >> a;
            s.push(a);
        }
        else if (str == "pop")
        {
            if (s.empty() == false)
            {
                cout << s.top() << endl;
                s.pop();
                continue;
            }
            cout << -1 << '\n';
        }
        else if (str == "size")
            cout << s.size() << endl;
        else if (str == "empty")
            cout << 1 * s.empty() << endl;
        else
        {
            if (s.empty() == false)
            {
                cout << s.top() << endl;
                continue;
            }
            cout << -1 << endl;
        }
    }
}