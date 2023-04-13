from sys import stdin as si


class SumOfNumbers:
    def __init__(self):
        self._input_data = list(
            map(
                int,
                si.readline().rstrip("\n").split()
            )
        )

        self._number_list = list(
            map(
                int,
                si.readline().rstrip("\n").split()
            )
        )

        self._number_amount = self._input_data[0]
        self._target_number = self._input_data[1]

        self._checked_amount = 0
        self._start_index = 0
        self._end_index = 1

        self.FindNumbers()

    def FindNumbers(self):
        while self._number_amount >= self._end_index >= self._start_index:
            partial_sum = sum(self._number_list[self._start_index:self._end_index])

            if partial_sum < self._target_number:
                self._end_index += 1

            elif partial_sum >= self._target_number:
                self._checked_amount += 1 if partial_sum == self._target_number else 0
                self._start_index += 1

        print(self._checked_amount)


if __name__ == '__main__':
    SON = SumOfNumbers()

