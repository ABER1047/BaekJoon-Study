from sys import stdin as si


class SumOfNumbers:
    def __init__(self):
        self._target_number = int(si.readline().rstrip("\n"))
        self._sum = 0
        self._number_group_count = 0
        self._start_number = 0
        self._end_number = 0
        self.FindSumOfNumbers()

    def FindSumOfNumbers(self):
        self._sum = 0
        self._number_group_count = 0
        self._start_number, self._end_number = 0, 0

        while self._end_number <= self._target_number:
            if self._sum < self._target_number:
                self._end_number += 1
                self._sum += self._end_number

            elif self._sum > self._target_number:
                self._sum -= self._start_number
                self._start_number += 1

            else:
                self._number_group_count += 1
                self._end_number += 1
                self._sum += self._end_number

        print(self._number_group_count)


if __name__ == '__main__':
    SON = SumOfNumbers()
