#include <iostream>
#include <deque>

using namespace std;
int main()
{
	ios_base::sync_with_stdio(0);
	cin.tie(0), cout.tie(0);

	int n, a;
	string s;
	deque<int> d;
	cin >> n;
	for (int i = 0; i < n; i++)
	{	
		cin >> s;
		if (s == "push_front")
		{
			cin >> a;
			d.push_front(a);
		}
		else if (s == "push_back")
		{
			cin >> a;
			d.push_back(a);
		}
		else if(s == "pop_front")
		{
			if (!d.empty())
			{
				cout << d.front() << "\n";
				d.pop_front();
				continue;
			}
			cout << -1 << "\n";
		}
		else if(s == "pop_back")
		{
			if (!d.empty())
			{
				cout << d.back() << "\n";
				d.pop_back();
				continue;
			}
			cout << -1 << "\n";
		}
		else if(s == "size")
			cout << d.size() << "\n";
		else if (s == "empty")
			cout << d.empty() * 1 << "\n";
		else if (s == "front")
		{
			if (!d.empty())
			{
				cout << d.front() << "\n";
				continue;
			}
			cout << -1 << "\n";
		}
		else
		{
			if (!d.empty())
			{
				cout << d.back() << "\n";
				continue;
			}
			cout << -1 << "\n";
		}
	}
}