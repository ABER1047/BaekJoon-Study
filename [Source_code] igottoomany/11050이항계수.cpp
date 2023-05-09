#include <iostream>
#include <algorithm>
#include <cmath>

using namespace std;

int factorial(int a)
{
	if (a <= 1)
		return (1);
	return a * factorial(a - 1);
}

int main()
{
	ios_base::sync_with_stdio(0);
	cin.tie(0), cout.tie(0);

	int n, k, pr, pk;
	cin >> n >> k;
	cout << factorial(n) / (factorial(k) * factorial(n - k)) << "\n";
}