from sys import stdin as si


class MinAndMax:
    def __init__(self):
        self._number_amount = int(si.readline().rstrip("\n"))
        self._number_list = list(
            map(
                int,
                si.readline().rstrip("\n").split()
            )
        )
        self._number_list.sort()
        self.FindMinAndMaxNumber()

    def FindMinAndMaxNumber(self):
        print(self._number_list[0], self._number_list[-1])


if __name__ == '__main__':
    MAM = MinAndMax()
