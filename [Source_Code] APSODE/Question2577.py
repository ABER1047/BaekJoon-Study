from sys import stdin as si


class AmountOfNumbers:
    def __init__(self):
        self._first_number = int(si.readline().rstrip("\n"))
        self._second_number = int(si.readline().rstrip("\n"))
        self._third_number = int(si.readline().rstrip("\n"))
        self.StartCount()

    def StartCount(self):
        multiple_number = self._first_number * self._second_number * self._third_number
        multiple_number_list = list(str(multiple_number))

        for check_num in range(10):
            print(multiple_number_list.count(str(check_num)))


if __name__ == '__main__':
    AON = AmountOfNumbers()
