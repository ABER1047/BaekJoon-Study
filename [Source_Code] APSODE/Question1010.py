from sys import stdin as si
from typing import List
from math import factorial


class BuildBridge:
    def __init__(self):
        self._test_case_maount = int(si.readline().rstrip("\n"))
        self._test_case_list: List[List[int]] = [list(map(int, si.readline().rstrip("\n").split())) for _ in range(self._test_case_maount)]
        self._bridge_amount_list = []
        self.CheckBridge()

    def CheckBridge(self):
        for test_case in self._test_case_list:
            n_site_amount = test_case[0]
            m_site_amount = test_case[1]
            if n_site_amount == m_site_amount:
                print(1)

            elif n_site_amount == 1:
                print(m_site_amount)

            else:
                print(round(factorial(m_site_amount) / (factorial(n_site_amount) * factorial(m_site_amount - n_site_amount))))


if __name__ == '__main__':
    BB = BuildBridge()
