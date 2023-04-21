import time
from sys import stdin as si
from math import log10, floor


class ConsecutiveNumberString:
    def __init__(self, debug_mode: bool = False):
        self._input_data = list(
            map(
                int,
                si.readline().rstrip("\n").split()
            )
        ) if not debug_mode else [10000000, 12341234]
        self.StartCalc()

    def StartCalc(self):
        num_temp = 1
        modulor = self._input_data[1]
        for number in range(1, self._input_data[0]):
            num_temp %= modulor
            squere = floor(log10(number + 1)) + 1
            num_temp *= 10 ** squere
            num_temp += number + 1

        print(num_temp % modulor)


if __name__ == '__main__':
    t1 = time.perf_counter()
    CNS = ConsecutiveNumberString(debug_mode = True)
    t2 = time.perf_counter()
    print(f"running time : {t2 - t1}ms")

