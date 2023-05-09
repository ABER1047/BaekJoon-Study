#include <iostream>
#include <queue>

using namespace std;
int main()
{
	ios_base::sync_with_stdio(0);
	cin.tie(0), cout.tie(0);

	int n, a;
	string s;
	queue<int> q;
	cin >> n;
	for (int i = 0; i < n; i++)
	{	
		cin >> s;
		if (s == "push")
		{
			cin >> a;
			q.push(a);
		}
		else if(s == "pop")
		{
			if (!q.empty())
			{
				cout << q.front() << "\n";
				q.pop();
				continue;
			}
			cout << -1 << "\n";
		}
		else if(s == "size")
			cout << q.size() << "\n";
		else if (s == "empty")
			cout << q.empty() * 1 << "\n";
		else if (s == "front")
		{
			if (!q.empty())
			{
				cout << q.front() << "\n";
				continue;
			}
			cout << -1 << "\n";
		}
		else
		{
			if (!q.empty())
			{
				cout << q.back() << "\n";
				continue;
			}
			cout << -1 << "\n";
		}
	}
}