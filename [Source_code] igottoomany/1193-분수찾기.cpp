#include <iostream>

using namespace std;
int main()
{
	ios_base::sync_with_stdio(0);
	cin.tie(0), cout.tie(0);

	int n, x = 1, y = 1;
	int a = 1, i = 0;

	cin >> n;
	for (; n > a; i++)
	{
		a += i;
	}
		cout << a<< "\n";
	cout << n - a + 1 << "/" << i + (a - n) << "\n";
}