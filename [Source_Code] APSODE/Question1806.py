from sys import stdin as st
from sys import maxsize


class PartialSum:
    def __init__(self):
        self._seq_data = list(
            map(
                int,
                st.readline().rstrip("\n").split(" ")
            )
        )

        self._seq_list = list(
            map(
                int,
                st.readline().rstrip("\n").split(" ")
            )
        )
        self._seq_length = self._seq_data[0]
        self._target_seq_sum = self._seq_data[1]
        self._partial_sum_min_len = maxsize
        self._start_index = 0
        self._end_index = 0
        self._partial_sum = 0

    def FindMinLengthPartialSum(self):
        while True:
            if self._partial_sum >= self._target_seq_sum:
                self._partial_sum_min_len = min(self._partial_sum_min_len, self._end_index - self._start_index)
                self._partial_sum -= self._seq_list[self._start_index]
                self._start_index += 1

            elif self._end_index == self._seq_length:
                break
            else:
                self._partial_sum += self._seq_list[self._end_index]
                self._end_index += 1

        print(self._partial_sum_min_len if self._partial_sum_min_len != maxsize else 0)


if __name__ == '__main__':
    PS = PartialSum()