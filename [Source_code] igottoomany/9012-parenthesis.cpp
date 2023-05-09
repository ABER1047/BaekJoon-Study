#include <iostream>
#include <stack>

using namespace std;
int main()
{
	ios_base::sync_with_stdio(0);
	cin.tie(0), cout.tie(0);

	int n, t;
	string str;
	cin >> n;
	for (int i = 0; i < n; i++)
	{
		cin >> str;
		t = 0;
		for (int j = 0; j < str.size(); j++)
		{
			if (str[j] == '(')
				t++;
			else if (str[j] == ')')
				t--;
			if (t < 0)
			{
				cout << "NO" << "\n";
				break;
			}
		}
		if (t == 0)
		{
			cout << "YES" << "\n";
			continue;
		}
		else if (t > 0) cout << "NO" << "\n";
	}
}