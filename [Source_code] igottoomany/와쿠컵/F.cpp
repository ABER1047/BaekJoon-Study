#include <iostream>
#include <set>

using namespace std;
set<string> s;
int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0), cout.tie(0);

    int n, cnt = 0;
    string str;
    string cheese = "Cheese";
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        cin >> str;
        if (s.find(str) != s.end())
            continue;
        s.insert(str);
        for (int j = 5; j >= 0 && !str.empty(); j--)
        {
            if (str.back() != cheese[j])
                break;
            if (j == 0 && str.back() == cheese[j])
                cnt++;
            str.pop_back();
        }
    }
    cout << (cnt >= 4 ? "yummy" : "sad") << "\n";
}