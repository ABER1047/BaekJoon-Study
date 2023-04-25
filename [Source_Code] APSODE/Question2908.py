from sys import stdin as si


class SangSu:
    def __init__(self):
        self._input_number = list(
            map(
                list,
                si.readline().rstrip("\n").split()
            )
        )
        self.SaySangSu()

    def SaySangSu(self):
        self._input_number[0].reverse()
        self._input_number[1].reverse()

        reverse_f = int("".join(self._input_number[0]))
        reverse_s = int("".join(self._input_number[1]))

        print(max([reverse_f, reverse_s]))


if __name__ == '__main__':
    SS = SangSu()
