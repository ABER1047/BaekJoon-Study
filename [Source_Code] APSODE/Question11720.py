from sys import stdin as si


class SumOfNumbers:
    def __init__(self):
        self._number_amount_buffer = si.readline().rstrip("\n")
        self._input_number = list(
            map(
                int,
                si.readline().rstrip("\n")
            )
        )
            
        self.CalcSum()

    def CalcSum(self):
        print(sum(self._input_number))


if __name__ == '__main__':
    SON = SumOfNumbers()
