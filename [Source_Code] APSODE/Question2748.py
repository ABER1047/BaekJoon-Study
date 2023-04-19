from sys import stdin as si


class FibonacciNumber:
    def __init__(self):
        self._fibonacci_amount = int(si.readline().rstrip("\n"))
        self._f_number = 0
        self._s_number = 1
        self._t_number = 0
        self.CalcFibonacci()

    def CalcFibonacci(self):
        for _ in range(self._fibonacci_amount):
            self._t_number = self._f_number + self._s_number
            self._f_number = self._s_number
            self._s_number = self._t_number

        print(self._f_number)


if __name__ == '__main__':
    FN = FibonacciNumber()
