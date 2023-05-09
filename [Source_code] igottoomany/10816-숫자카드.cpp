#include <iostream>
#include <map>
#include <algorithm>
#include <list>
#include <vector>

using namespace std;
int rst[500001];
int main()
{
	ios_base::sync_with_stdio(0);
	cin.tie(0), cout.tie(0);

	int n, a, cnt = 0;
	map<int, int> m;
	map<int, int>::iterator iter;
	cin >> n;
	for (int i = 0; i < n; i++)
	{
		cin >> a;
		m[a]++;
	}
	cin >> n;
	for (int i = 0; i < n; i++)
	{
		cin >> a;
		cout << m[a] << " ";
	}
}