#include <iostream>

using namespace std;
int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0), cout.tie(0);
    cout.precision(8);

    double d1, d2, x;
    double v1, v2, m1, m2;

    cin >> d1 >> d2 >> x;
    if (d1 < d2)
    {
        double temp = d1;
        d1 = d2;
        d2 = temp;
    }
    m1 = x;
    m2 = 100 - x;
    v1 = m1 / d1;
    v2 = m2 / d2;
    cout << (m1 + m2) / (v1 + v2) << "\n";
}